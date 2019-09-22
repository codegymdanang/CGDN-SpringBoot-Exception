package codegym.vn.expection.checkuncheck;

public class BankAccount {

    private String owner;
    private int amount;

    public BankAccount(String name) {
        this.owner = owner;

    }

    //Uncheck Runtime
    public void openAccount(int amount) {
        if (amount < 0) {
            throw new RuntimeException("Lack of money");
        }
        this.setAmount(amount);
        System.out.println("Account is open");
    }

    //check exception
    public void deposit(int depositAmount) throws Exception {
        if (depositAmount > getAmount()) {
            throw new Exception("Current Amount is less than Deposit");
        }
        System.out.println("Deposit is valid " + depositAmount);
    }

    // customer message check exception
    public void depositCustomException(int depositAmount) throws Exception {
        if (depositAmount > getAmount()) {
            throw new CustomerException("No Action For this");
        }
        System.out.println("Deposit is valid " + depositAmount);
    }




    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
