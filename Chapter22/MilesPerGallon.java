import java.util.Scanner ;

public class MilesPerGallon{
    public static void main(String[] args){
        int initialMiles = 0 ;
        int finalMiles = 0 ;
        int gallons = 0 ;

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Miles Per Gallon Program");

        while (initialMiles != -1 ){
            System.out.println("Initial Miles: ");
            initialMiles = scan.nextInt();

            System.out.println("Final Miles: ");
            finalMiles = scan.nextInt();

            System.out.println("Gallons: ");
            gallons = scan.nextInt();

            double MilesPerGallon = (finalMiles - initialMiles) / gallons ;

            System.out.println("Miles per gallon: " + MilesPerGallon);
        }
    }
}