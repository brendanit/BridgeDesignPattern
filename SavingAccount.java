import java.io.Console;

class SavingAccount implements IAccount {
    static float balance = 1000;
    static String name = "";

    public SavingAccount(String a0001) {
    }

    public void SavingAccountLegacy(String name) {
        String Name = name;
        System.out.println("Opened personal account with balance {0}" + balance);
    }

    public void Deposit(float amount) {
        balance += amount;
        System.out.println("Deposited: {0} | New balance: {1}" + amount + balance);
    }

    public void Withdraw(float amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Widthdrawn: {0} | New balance: {1}" + amount + balance);
            return;
        }
        System.out.println("Could not withdraw. Current balance is {0}" + balance);
    }

    public static float getBalance() {
        return balance;
    }

    public static String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }


}    