import java.util.Scanner;

public class LogBase{

    public static void main(String[] args){
        double input = 0;
        double answer = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a double: ");
        input = scan.nextDouble();

        answer = (Math.log(input))/(Math.log(2));

        System.out.println("Base log 2 of " + input + " is " + answer);
    }
}