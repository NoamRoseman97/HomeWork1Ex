public class BasicAccount implements IAccount{

    //State
    int AccountNum;
    double WithdrawlLim;

    //Constructor
    public BasicAccount (int accountNumber, double withdrawlLimit) {
        this.AccountNum = accountNumber;
        this.WithdrawlLim = withdrawlLimit;


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
