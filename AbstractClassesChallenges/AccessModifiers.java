package AbstractClassesChallenges;

public class AccessModifiers {
  abstract class BankAccount {
    protected int accountNumber;
    protected double balance;

    public BankAccount(int accountNumber, double balance) {
      this.accountNumber = accountNumber;
      this.balance = balance;
    }

    public abstract double calculateInterest();

    public void getDetails() {
      System.out.println("Account: " + accountNumber + ", Balance: $" + balance);
    }
  }

  class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, double balance) {
      super(accountNumber, balance);
    }

    @Override
    public double calculateInterest() {
      return balance * 0.05;
    }
  }

}
