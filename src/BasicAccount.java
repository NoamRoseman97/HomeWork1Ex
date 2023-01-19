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
        this.Balance += amount;
    }

    @Override
    public double Withdraw(double amount) // method argument
    {
        double curAmount = 0; // local variable
        if (amount > WithdrawLim)
        {
            curAmount = WithdrawLim;
        }
        if (amount > Balance)
        {
            curAmount = Balance;
        }
        Balance -= curAmount;
        return curAmount;
    }


    @Override
    public double GetCurrentBalance() {
        return this.Balance;
    }

    @Override
    public int GetAccountNumber() {
        return this.AccountNum;
    }
}
