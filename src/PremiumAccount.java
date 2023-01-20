public class PremiumAccount implements IAccount {

    //State
    double Balance;
    int AccountNum;



    //Constructor
    public PremiumAccount(int accountNumber) {
        this.AccountNum = accountNumber;
        this.Balance = 0;
    }


    // Behaviour

    @Override
    public void Deposit(double amount) {
        Balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        Balance -= amount;
        return amount;
    }

    @Override
    public double GetCurrentBalance() {
        return Balance;
    }

    @Override
    public int GetAccountNumber() {
        return AccountNum;
    }
}



