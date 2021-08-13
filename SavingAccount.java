class SavingAccount extends AccountBase {
    public SavingAccount(String name, AccountType type)     {
    }
    @Override
    public void Deposit(float amount)
    {
        transactionImp.Deposit(amount);
    }
    @Override
    public void Withdraw(float amount) { transactionImp.Withdraw(amount); }

    public float Balance()
    {
        return transactionImp.GetBalance();
    }

}
