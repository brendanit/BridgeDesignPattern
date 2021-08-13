interface ITransaction
{
    void Deposit(float amount);

    default void Withdraw( float amount ) {

    }

    float GetBalance();
    //float GetBalance();
}