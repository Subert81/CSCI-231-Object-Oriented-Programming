
/**
    Write bank Account family classes. The Account class is base class. 
    CheckingAccount and SavingsAccount are derived classes. 
    The class diagrams are following:
    The class design could be better. However, we are limited with the knowledge we have now. So the above class diagram is reasonable. 
    All methods are explained by their names. Please pay attention to withdraw methods. 
    The Account class withdraw method is implemented by doing nothing. 
    The CheckingAccount withdraw method must fulfill the policy that the withdraw amount must greater than 0 and less than or equal to current account balance. 
    The SavingsAccount withdraw method must fulfill the policy that the minimum balance of the account must be 500 all the time. Also the withdraw amount must greater than 0. 
    If the condition cannot be fulfilled, either withdraw method will do nothing but return. 
    When addInterest method in SavingsAccount class, the account balance updated to current_balance * (1 + interestRate) where interestRate is in decimal form. 
    For instane, 6% is 0.06. The students must write a main function to test these accounts. 
    In main function, polymorphism must be used to handle a collection of accounts.

 * @author "Name Goes Here!"
 * @version 4/27/2021
 */

   public abstract class Account
   {

    private int id;
    private double balance;

        public Account()
        {
            id = 1000;
            balance = 0.0;
    
        }
    
        public Account(int id, double balance)
        {
    
            this.id = id;
            this.balance = balance;
    
        }
    
        public void setBalance(double balance)
        {
            this.balance = balance;
        }
        public double getBalance()
        {
            return balance;
        }
        public void setID(int id)
        {
            this.id = id;
        }
        public int getId()
        {
            return id;
        }
        public void deosit(double amount)
        {
            if(amount <= 0)
                return;
            balance = balance + amount;
    
        }

        public abstract void withdraw(double amount);
        public String toString()
        {
            return "ID" + id + "\nBalance: $" + balance;
        }




}

