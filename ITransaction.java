interface ITransaction
{
    void Deposit(float amount);
    void Withdraw( float amount );
    float GetBalance();
}