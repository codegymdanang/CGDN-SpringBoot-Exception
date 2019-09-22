package codegym.vn.expection.checkuncheck;

public class Main {


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("nguyen");
        bankAccount.openAccount(10);
        try {
              bankAccount.deposit(50);
        //    bankAccount.depositCustomException(50);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
