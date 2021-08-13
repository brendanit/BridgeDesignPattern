class Program
{
    public static void main(String[] args)
    {
        IAccount account = new SavingAccount("A0001", AccountType.Personal);
        account.Withdraw(800);
        account.Deposit(100);
        account.Withdraw(400);

        account = new SavingAccount("C2102",AccountType.Corporate);
        account.Withdraw(100);
        account.Deposit(1000);
        account.Withdraw(5000);
        account.Withdraw(200);
    }
}