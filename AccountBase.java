abstract class AccountBase implements IAccount {
    // this is protected and hidden from the client
    protected ITransaction transactionImp;
    public String name;

    public AccountBase(String name, AccountType type) throws Exception {
        String Name = name;
        switch (type) {
            case Personal:
                transactionImp = new Personal(1000);
                break;
            case Corporate:
                transactionImp = new Corporate(5000);
                break;
            default:
                throw new Exception("Unknown account type");
        }
    }

    public abstract void Deposit(float amount);

    public abstract void Withdraw(float amount);

    public float Balance(){
        float Balance =0;
        return Balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public AccountBase(){
    }
}
enum AccountType
{
    Personal ,
    Corporate
}