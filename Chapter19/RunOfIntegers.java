import java.util.Scanner ;

public class RunOfIntegers{
    public static void main(String[] args){
        int Startnum = 0 ;
        int Endnum = 0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Start #: ");
        Startnum = scan.nextInt();

        System.out.println("End #: ");
        Endnum = scan.nextInt();

        int i = Startnum ;

        while(i <= Endnum){
            System.out.println(i);
            i = i + 1 ;
        }
    }
}