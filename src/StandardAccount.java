public class StandardAccount implements IAccount{

    //State
    int AccountNum;
    double CreditLim;


    //Constructor
    public StandardAccount(int accountNumber, double creditLimit) {
        this.AccountNum = accountNumber;
        this.CreditLim = creditLimit;

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
