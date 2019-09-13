import java.util.Scanner ;
import java.lang.Math ;

public class WindChill{

    public static void main(String[] args){
        int windSpeed = 0;
        int temprature = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Wind Speed: ");
        windSpeed = scan.nextInt();

        System.out.println("Enter Temprature: ");
        temprature = scan.nextInt();

        double windChill = 0 ;

        if ((windSpeed < 3) || (temprature > 50 )){
            windChill = 0 ;
        } else {
            windChill = (35.74) + (0.6215 * temprature) - 
                (35.75 * Math.pow(windSpeed, 0.16)) + 
                (0.4275 * temprature * Math.pow(windSpeed, 0.16)) ;
        }

        System.out.println("Wind Chill: " + windChill);
    }
}