class Personal implements ITransaction
{
    private float Balance = 0;

    public Personal(float balance)
    {
        Balance = balance;
        System.out.println("Opened personal account with balance {0}" + balance);
    }
    public void Deposit(float amount)
    {
        Balance += amount;
        System.out.println("Deposited: {0} | New balance: {1}" + amount + Balance);
    }
    //@Override
    public  float GetBalance()
    {
        return Balance;
    }

    public void Withdraw(float amount)
    {
        if (amount < Balance)
        {
            Balance -= amount;
            System.out.println("Widthdrawn: {0} | New balance: {1}" + amount + Balance);
            return;
        }
        System.out.println("Could not withdraw. Current balance is {0}" + Balance);
    }
}

class Corporate  implements ITransaction
{
    private float Balance = 0;
    private float Overdraft =0;
    private float _overdraft = 0;
    public static final float overdraft_factor = 0.1f;
    public Corporate(float balance)
    {
        Balance = balance;
        Overdraft = Balance;
        System.out.println("Opened corporate account with balance {0}" + balance);
        System.out.println("Overdraft stands at {0}" + _overdraft);
    }
    public void Deposit(float amount)
    {
        Balance += amount;
        Overdraft = Balance;
        System.out.println("Deposited: {0} | New balance: {1} | Overdraft: {2}" +
                amount + Balance + Overdraft);
    }

    public float GetBalance()
    {
        return Balance;
    }

    public void Withdraw(float amount)
    {
        if (amount < Overdraft)
        {
            Balance -= amount;
            Overdraft = Balance;
            System.out.println("Widthdrawn: {0} | New balance: {1} | Overdraft: {2}" +
                    amount + Balance + Overdraft);
            return;
        }
        System.out.println("Could not withdraw. Current overdraft limit {0}" + Overdraft);
    }

    private float Overdraft() {
        return _overdraft;
    }
    public void setOverdraft(float _overdraft){
        this._overdraft = Math.abs(Integer.MAX_VALUE) + (Math.abs(Integer.MAX_VALUE) * overdraft_factor);
    }
}
