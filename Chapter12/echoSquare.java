import java.util.Scanner ;

public class echoSquare {

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int num, square;

        System.out.println("Enter an integer: ");
        num = scan.nextInt();
        square = num * num ;

        System.out.println("The Square of " + num + " is " + square);
    }
}