import java.util.Scanner ;

public class ApplienceCost{

    public static void main(String[] args){
        double cost = 0;
        int hours = 0;

        Scanner scan = new Scanner(System.in);

        double answer = 0;

        System.out.println("Enter cost per kilowatt-hour in cents: ");
        cost = scan.nextDouble();

        System.out.println("Enter kilowatt-hours used per year: ");
        hours = scan.nextInt();

        answer = (cost * hours) / 100;

        System.out.println("Annual cost: " + answer);
    }

}