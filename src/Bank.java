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
        for (int i = 0; i < Accounts.size(); i++)
        {
            if (Accounts.get(i).GetAccountNumber() == accountNumber)
            {
                IAccount account = Accounts.get(i);

                if (account.GetCurrentBalance() >= 0)
                {
                    Accounts.remove(i);
                }
                else
                {
                    // prints error message
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
        return null;
    }

    @Override
    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        return null;
    }
}