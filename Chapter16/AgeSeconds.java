import java.util.Scanner ;

public class AgeSeconds {

    public static void main(String[] args){
        int years = 0;
        int month = 0;
        int days = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many years have you been alive?");
        years = scan.nextInt();
        System.out.println("How many months have passed this year?");
        month = scan.nextInt();
        System.out.println("How many days have passed so far this month?");
        days = scan.nextInt();

        int totalDays = 0 ;

        if (month = 1 || 3 || 5 || 7 || 8 || 10 || 12){
            if (month = 1){
                totalDays = days
            }
            if ((month > 2) && (month <= 7)){
                totalDays = ((month / 2) * 61) - 2 + days ;
            }
            if (month >= 8){
                totalDays = (((month - 5) / 2) * 61) + 210 + days ;
            }
        } else {

        }
    }
}