import java.util.Scanner ;
import java.lang.Math ;

public class EToX{
    public static void main(String[] args){
        int N = 0 ;
        double answer = 0.0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter x: ");
        N = scan.nextInt();

        int i = 1;
        double previousTerm = 1 ;

        while(previousTerm > 0.000000000001){
            double term = previousTerm * (N / i);
            answer += term ;
            previousTerm = term;
            i++ ;
            System.out.println("n: " + i + "\tterm: " + term + "\tsum: " + answer);
        }
    }
}