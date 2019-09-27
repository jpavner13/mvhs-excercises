import java.util.Scanner ;
import java.lang.Math ;

public class EToX{
    public static void main(String[] args){
        double N = 0 ;
        double answer = 1.0 ;
        double term = 1 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        N = scan.nextInt();

        int i = 1;

        while(term > 1.0E-12){

            term *= N/i++;
            answer += term ;
            System.out.println("n: " + (i - 1) + "\tterm: " + term + "\tsum: " + answer);
        }

        System.out.println("My e^x: " + answer);
        System.out.println("Real e^x: " + Math.exp(N));
    }
}