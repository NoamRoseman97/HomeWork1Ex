public class PremiumAccount implements IAccount {


    //State
    int AccountNum;

    //Constructor
    public PremiumAccount(int accountNumber) {
        this.AccountNum = accountNumber;
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
