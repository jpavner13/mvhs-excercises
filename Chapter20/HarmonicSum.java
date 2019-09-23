import java.util.Scanner ;

public class HarmonicSum{

    public static void main(String[] args){
        double EndNum = 0.0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        EndNum = scan.nextInt();

        int i = 1 ;
        double sum = 0 ;

        while(i < EndNum){
            double add = 1.0 / i ;
            sum = sum + add ;
            i++ ;
        }

        System.out.println("Sum is: " + (sum + 1));
    }
}