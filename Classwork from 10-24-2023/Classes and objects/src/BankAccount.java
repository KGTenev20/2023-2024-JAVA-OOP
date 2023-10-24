public class BankAccount {
    private int id = 1;
    private double balance;
    private static double INTEREST_RATE = 0.02;
    //private static int COUNT = 1;

    public BankAccount(){
        id++;
    }

    public static void setInterestRate(double interest) {
        INTEREST_RATE = interest;
    }

    public double getInterestRate(int years){
        return this.balance * INTEREST_RATE * years;
    }

    public void deposit(double amount){
        balance += amount;
    }

}
