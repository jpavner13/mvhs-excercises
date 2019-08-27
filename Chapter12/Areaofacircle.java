import java.util.Scanner ;

public class Areaofacircle {
    public static void main(String[] args){
        double answer = 0;
        Scanner scan = new Scanner( System.in );

        System.out.println("Input the Radius: ");
        int num = scan.nextInt();

        answer = ( Math.PI * (num * num));

        System.out.println("The area is: " + num + " The area is: " + answer);
    }
}