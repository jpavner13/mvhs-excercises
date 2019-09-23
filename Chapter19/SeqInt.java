import java.util.Scanner ;

public class SeqInt{
    public static void main(String[] args){
        int Endnum = 0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        Endnum = scan.nextInt();

        int sum = 0;
        int i = 0;

        while(i <= Endnum){
            sum = sum + i ;
            i = i + 1 ;
        }

        int EquationAnswer = (Endnum * (Endnum + 1)) / 2 ;

        System.out.println("Loop sum = " + sum);
        System.out.println("Equation sum = " + EquationAnswer);
    }
}