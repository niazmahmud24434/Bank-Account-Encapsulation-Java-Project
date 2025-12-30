class BankAccount { 
   private String accountNumber; 
   private String accountHolderName; 
   private double balance; 
 
   BankAccount(String accountNumber, String accountHolderName, double balance) { 
       this.accountNumber = accountNumber; 
       this.accountHolderName = accountHolderName; 
       this.balance = balance; 
   } 
 
   public String getAccountNumber() { 
       return accountNumber; 
   } 
 
   public void setAccountNumber(String accountNumber) { 
       this.accountNumber = accountNumber; 
   } 
 
   public String getAccountHolderName() { 
       return accountHolderName; 
   } 
 
   public void setAccountHolderName(String accountHolderName) { 
       this.accountHolderName = accountHolderName; 
   } 
 
   public double getBalance() { 
       return balance; 
   } 
 
   public void setBalance(double balance) { 
       if (balance < 0) { 
           System.out.println("Invalid balance. Balance cannot be negative."); 
       } else { 
           this.balance = balance; 
       } 
   } 
} 
 
public class Main { 
   public static void main(String[] args) { 
       BankAccount acc1 = new BankAccount("A101", "Alice", 5000); 
       BankAccount acc2 = new BankAccount("A102", "Bob", 3000); 
       BankAccount acc3 = new BankAccount("A103", "Charlie", 7000); 
 
       acc1.setBalance(6000); 
       acc2.setBalance(-2000); 
       acc3.setBalance(8000); 
 
       System.out.println(acc1.getAccountNumber() + " " + acc1.getAccountHolderName() + " " + acc1.getBalance()); 
       System.out.println(acc2.getAccountNumber() + " " + acc2.getAccountHolderName() + " " + acc2.getBalance()); 
       System.out.println(acc3.getAccountNumber() + " " + acc3.getAccountHolderName() + " " + acc3.getBalance()); 
   } 
} 
 