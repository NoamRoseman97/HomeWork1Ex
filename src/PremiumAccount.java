public class PremiumAccount implements IAccount {


    //State
    int AccountNum;

    double balance;

    //Constructor
    public PremiumAccount(int accountNumber) {
        this.AccountNum = accountNumber;
        this.balance = 0;
    }



    //Behaviour
    @Override
    public void Deposit(double amount) {

    }

    @Override
    public double Withdraw(double amount) {
        return 0;
    }

    @Override
    public double GetCurrentBalance() {
        return 0;
    }

    @Override
    public int GetAccountNumber() {
        return 0;
    }
}
