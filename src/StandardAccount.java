public class StandardAccount implements IAccount{

    //State
    double Balance;
    int AccountNum;
    double CreditLim;


    //Constructor
    public StandardAccount(int accountNumber, double creditLimit) {
        this.AccountNum = accountNumber;
        this.Balance = 0;
        if (CreditLim > 0) {
            this.CreditLim = 0;
        }else {
            this.CreditLim = creditLimit;
        }
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
