import java.util.Scanner ;

public class Change {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("How much change is needed?");
        int total_cents = scan.nextInt();

        int cents_left = total_cents ;

        int dollars = total_cents / 100 ;
        cents_left = cents_left - (dollars * 100);
        int quarters = cents_left / 25 ;
        cents_left = cents_left - (quarters * 25);
        int dimes = cents_left / 10 ;
        cents_left = cents_left - (dimes * 10);
        int nickles = cents_left / 5 ;
        int pennies = total_cents % 5 ;

        System.out.println("D " + dollars + " Q " + quarters + " DI " + dimes + " N " + nickles + " P " +pennies);
    }
}