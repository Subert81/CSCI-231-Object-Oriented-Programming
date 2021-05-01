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
public class SavingsAccount extends Account{
    
    private double interestRate;

    // using super to inherit Account class constructor and add set up interest rate
    public SavingsAccount(int id, double balance, double interestRate)
    {
        super(id, balance);
        this.interestRate = interestRate;
    }
    
    // set up default values of savings account.
    public SavingsAccount()
    {
        this(1000, 0.0, 0.02);
    }

    public SavingsAccount(int id, double balance)
    {
        this(id, balance, 0.02);
    }

    public void setInterestRate(double interestRate)
    {

        this.interestRate = interestRate;
    }

    public double getInterestRate()
    {
        
        return interestRate;

    }

    public void withdraw(double amount)
    {
        if (amount > 0 && amount <= getBalance() - 500.00)
            setBalance(getBalance() - amount);

    }

    public void addInterest()
    {
        setBalance(getBalance() * (1+interestRate));
    }

    public String toString()
    {
        return super.toString() + "\nInterest Rate: " + interestRate;


    }
}
