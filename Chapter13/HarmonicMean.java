import java.util.Scanner;

public class HarmonicMean{

    public static void main(String[] args){
        double x = 0;
        double y = 0;
        double average = 0;
        double mean = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X: ");
        x = scan.nextDouble();

        System.out.println("Enter Y: ");
        y = scan.nextDouble();

        average = (x + y) / 2 ;
        System.out.println("Arithmetic mean: " + average);

        mean = 2 / ((1 / x) + (1 / y));
        System.out.println("Harmonic mean: " + mean);
    }
}