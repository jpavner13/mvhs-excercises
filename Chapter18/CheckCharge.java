import java.util.Scanner ;

public class CheckCharge {

    public static void main(String[] args){
        int checking = 0 ;
        int savings = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("How much is in your checking account? ");
        checking = scan.nextInt();

        System.out.println("How much is in your savings account? ");
        savings = scan.nextInt();

        if (checking >= 1000 || savings >= 1500){
            System.out.println("Service charge = $0");
        } else {
            System.out.println("Service charge = $0.15");
        }
    }
}