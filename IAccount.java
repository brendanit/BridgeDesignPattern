interface IAccount
{
    void Deposit(float amount);
    void Withdraw(float amount);
    float Balance = SavingAccount.getBalance();
    String Name = SavingAccount.getName();
}