package Banking;
import java.io.*;
public class AccountTransaction extends BankAccount implements Transactionable {
    public AccountTransaction(String accId) {
        super(accId);
    }
    public boolean hasAccountId() {
        File file = new File(getFilename());
        if (!file.exists()) {
            return false;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(getAccId())) {
                    setAccBalance(Double.parseDouble(data[1]));
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    @Override
    public void deposit(double amount) {
        double newBalance = getAccBalance() + amount;
        setAccBalance(newBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= getAccBalance()) {
            double newBalance = getAccBalance() - amount;
            setAccBalance(newBalance);
        }
    }
    @Override
    public double checkBalance() {
        return getAccBalance();
    }
}