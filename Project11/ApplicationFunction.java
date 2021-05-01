
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

//main fucntion to implement Account
public class ApplicationFunction{

    public static void main (String[] args){
        // array accts with 4 elements
        Account [] accts = new Account[4];

        accts[0] = new CheckingAccount();
        accts[1] = new CheckingAccount(1001,5670.00);
        accts[2] = new SavingsAccount(2001,60000, 0.03);
        accts[3] = new SavingsAccount(1001,42000, 0.02);

            for(int i = 0; i < accts.length; i++)
                System.out.println("Account #" + (i+1) + " information: \n" + accts[i]);
            
        accts[0].withdraw(3000);
        accts[1].withdraw(10000);
        ((SavingsAccount) accts[2]).addInterest();
        accts[3].withdraw(60000);

            for(int i = 0; i < accts.length; i++)
                System.out.println("Now Account #" + (i+1) + " information: \n" + accts[i]);

}
}

