interface IAccount
{
    void Deposit(float amount);
    void Withdraw(float amount);
    default float GetBalance() {
        return 0;
    }
    //float Balance = Personal.GetBalance();
   // String Name = Personal.getName();
}