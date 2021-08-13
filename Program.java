class Program
{
    public static void main(String[] args)
    {

        IAccount account = new SavingAccount("A0001", AccountType.Corporate);
        account.Withdraw(800);
        account.Deposit(100);
        account.Withdraw(400);

        account = new CreditAccount("C2102", AccountType.Personal);
        account.Withdraw(1000);
        account.Deposit(1000);
        account.Withdraw(5000);
        account.Withdraw(200);
    }
}

