class CreditAccount extends AccountBase
        {
            public static final float charge = 0.03f;

public CreditAccount(String name, AccountType type)


        {
        }
@Override
public void Deposit(float amount)
        {
        transactionImp.Deposit(amount);
        }
            @Override
public void Withdraw(float amount)
        {
        amount = amount + (amount * charge);
            System.out.println("Credit withdraw surcharge levied: {0}" + amount* charge);
        transactionImp.Withdraw(amount);
        }

public  float Balance()
        {
        return transactionImp.GetBalance();
        }
        }
