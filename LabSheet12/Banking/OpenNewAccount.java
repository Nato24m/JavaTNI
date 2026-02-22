package Banking;

import java.io.*;

public class OpenNewAccount extends BankAccount {

    public OpenNewAccount(String accId, double accBalance) {
        super(accId, accBalance);
    }

    public String recordAccount() {
        if (isExistingAccount(getAccId())) {
            return "This account has been created!!";
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFilename(), true))) {
            bw.write(toString());
            bw.newLine();
        } catch (Exception err) {}
        return "Created account success!!";
    }


    private boolean isExistingAccount(String id) {
        File f = new File(getFilename());
        if (!f.exists()) return false;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] p = line.split(",");
                if (p[0].equals(id)) return true;
            }
        } catch (Exception err) {}
        return false;
    }



}