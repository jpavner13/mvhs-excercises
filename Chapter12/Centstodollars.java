import java.util.Scanner;

public class Centstodollars {
    public static void main(String[] args){
        Scanner scan = new Scanner ( System.in );

        System.out.println("Input the cents: ");
        int total_cents = scan.nextInt();

        int dollars = total_cents / 100 ;
        int cents = total_cents % 100 ;

        System.out.println("That is " + dollars + " dollars and " + cents + " cents.");
    }
}