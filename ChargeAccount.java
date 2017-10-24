 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance = 0.0; 
           double additionalCharges = 0.0;
           double interest = 0.0;         
           double newBalance = 0.0;  
           double minPayment = 0.0;
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the amount of additional charges");
           additionalCharges = scan.nextDouble();
 
           //compute interest
           interest = 0.02 * previousBalance;
           
           //calculate new balance
           newBalance = previousBalance - additionalCharges - interest;
           
           //calculate minimum payment based on new balance amount
           if( newBalance < 50 ) {
               minPayment = newBalance;
           }
           
           if( 50 <= newBalance && newBalance <= 300) {
               minPayment = 50;
           }
           
           if( 300 < newBalance) {
               minPayment = 0.2 * newBalance;
           }
           
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println();
           System.out.println("Previous Balance: \t" + money.format(previousBalance));
           System.out.println("Additional Charges: \t" + money.format(additionalCharges));
           System.out.println("Interest: \t \t" + money.format(interest));
           System.out.println();
           System.out.println("New Balance: \t \t" + money.format(newBalance));
           System.out.println();
           System.out.println("Minimum Payment: \t" + money.format(minPayment));
        }
}