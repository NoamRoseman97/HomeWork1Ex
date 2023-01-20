import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank
{
    List<IAccount> Accounts;
    public Bank() {
        Accounts = new ArrayList<>();

    }

    @Override
    public void OpenAccount(IAccount account) {
        Accounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        // a1 -> a2 -> a3 -> a4 -> ....
        for (int i = 0; i < Accounts.size(); i++)               //iterate from the first to the last index.
        {
            if (Accounts.get(i).GetAccountNumber() == accountNumber)            //if we reached our requested accountnum
            {
                IAccount account = Accounts.get(i);         // get it

                if (account.GetCurrentBalance() >= 0)
                {
                    Accounts.remove(i);
                }
                else
                {
                    System.out.println("The account is not closed due to debt");
                }

                return;
            }
        }
    }

    @Override
    public List<IAccount> GetAllAccounts() {
        return Accounts;
    }

    @Override
    public List<IAccount> GetAllAccountsInDebt() {
        List <IAccount> negativeBalance;
        negativeBalance = new ArrayList<>();
        for (int i = 0; i < Accounts.size(); i++)
        {
            if (Accounts.get(i).GetCurrentBalance() < 0)
            {
                negativeBalance.add(Accounts.get(i));
            }
        }
        return negativeBalance;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        List <IAccount> positiveBalance;
         positiveBalance = new ArrayList<>();
        for (int i = 0; i < Accounts.size(); i++)
        {
            if (Accounts.get(i).GetCurrentBalance() > 0)
            {
                positiveBalance.add(Accounts.get(i));
            }
        }

        return positiveBalance;
    }
}