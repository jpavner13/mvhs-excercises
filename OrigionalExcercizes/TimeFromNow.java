import java.util.Scanner ;
import java.time.LocalDateTime ;

public class TimeFromNow {

    public static void main(String[] args){
        int current_hour = LocalDateTime.now().getHour();
        int current_min = LocalDateTime.now().getMinute();
        int current_sec = LocalDateTime.now().getSecond();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the hour: ");
        int input_hour = scan.nextInt();

        System.out.println("Enter the minutes: ");
        int input_min = scan.nextInt();

        System.out.println("Enter the seconds: ");
        int input_sec = scan.nextInt();

        int diff_hour = input_hour - current_hour ; 
        int diff_min = input_min - current_min ;
        int diff_sec = input_sec - current_sec ;

        if (input_hour < current_hour){
            diff_hour = (current_hour + (24 - current_hour) + 2) % 12 ;
        }

        System.out.println("H: " + diff_hour + " M: " + diff_min + " S: " + diff_min);

        // System.out.println("H: " + current_hour + " M: " + current_min + " S: " + current_sec);


    }
}