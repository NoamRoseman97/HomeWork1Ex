public class StandardAccount implements IAccount{

    //State
    int AccountnNum;
    double CreditLimit;


    //Constructor
    public StandardAccount(int accountNumber, double creditLimit) {
        this.AccountnNum = accountNumber;
        this.CreditLimit = creditLimit;

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
