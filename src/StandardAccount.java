public class StandardAccount implements IAccount{

    //State
    double Balance;
    int AccountNum;
    double CreditLim;

    //Constructor
    public StandardAccount(int accountNumber, double creditLimit) {
        this.AccountNum = accountNumber;
        this.Balance = 0;

        if (creditLimit > 0)
        {
            this.CreditLim = 0;
        }
        else
        {
            this.CreditLim = creditLimit;
        }
    }


    //Behaviour
    @Override
    public void Deposit(double amount)
    {
        this.Balance += amount;
    }


    @Override
    public double Withdraw(double amount) {
        double maxWithdrawal = Balance - CreditLim;
        if (amount > maxWithdrawal) {
            amount = maxWithdrawal;
        }
        Balance -= amount;
        return amount;
    }


    @Override
    public double GetCurrentBalance()
    {
        return this.Balance;
    }

    @Override
    public int GetAccountNumber()
    {
        return this.AccountNum;
    }
}
