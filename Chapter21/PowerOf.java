import java.lang.Math ;
import java.util.Scanner ;

public class PowerOf {
    public static void main(String[] args) {
        double Base = 0.0 ;
        int Power = 0 ;

        Scanner scan = new Scanner(System.in) ;

        System.out.println("Enter Base: ") ;
        Base = scan.nextDouble();

        System.out.println("Enter Exponent: ") ;
        Power = scan.nextInt();

        int i = 0 ;
        double answer = 0.0 ;

        if (Power < 0 ){
            System.out.println("Exponent muct be a positive Integer.");
        } else {
           answer = Math.pow(Base, Power);
           System.out.println(Base + " to the power of " + Power + " is " + answer);
        }
    }
}