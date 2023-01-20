public class BasicAccount extends StandardAccount{

    //State
    double WithdrawLim;


    //Constructor
    public BasicAccount (int accountNumber, double withdrawLimit) {
        super (accountNumber,0);
        this.WithdrawLim = withdrawLimit;

    }

    //Behaviour
    @Override
    public double Withdraw(double amount) // method argument
    {
        if (amount > WithdrawLim) {
            amount = WithdrawLim;
        }
        return super.Withdraw(amount);
    }
}
