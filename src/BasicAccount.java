public class BasicAccount implements IAccount{

    //State
    double Balance;
    int AccountNum;
    double WithdrawLim;


    //Constructor
    public BasicAccount (int accountNumber, double withdrawLimit) {
        this.AccountNum = accountNumber;
        this.WithdrawLim = withdrawLimit;
         this.Balance = 0;

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
