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
        if (CreditLim > amount)
        {
            this.Balance += amount;
        }
        else
        {
            this.Balance += this.CreditLim;
        }
    }


    @Override
    public double Withdraw(double amount) {
            if (this.Balance == this.CreditLim)
            {
                return 0;
            }

            else if (amount > this.Balance - this.CreditLim)
            {
                return this.Balance - this.CreditLim;
            }

            else
            {
                this.Balance = this.Balance - amount;
                return amount;
            }
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
