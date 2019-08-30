import java.util.Scanner;

public class DistanceABrickTravels{

    public static void main(String[] args){
        double seconds = 0;
        double distance = 0;

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the number of seconds: ");
        seconds = scan.nextDouble();

        distance = (0.5) * 32.174 * (seconds * seconds);

        System.out.println("Distance: " + distance);
    }
}