import java.util.Scanner ;
import java.util.Random ;

public class MultiplicationQuiz {
    public static void main(String[] args ) {
        int i = 0 ;

        Random ran = new Random();
        Scanner scan = new Scanner(System.in);

        int correct = 0 ;

        while( i < 10 ){

            int int1 = ran.nextInt(10) ;
            int int2 = ran.nextInt(10) ;

            System.out.println("What is " + int1 + " * " + int2 + "?");
            int userAnswer = scan.nextInt();

            int answer = int1 * int2 ;

            if(userAnswer == answer){
                System.out.println("Right!");
                correct++ ;
            } else {
                System.out.println("Wrong. The corrct answer is " + answer + ".");
            }

            i++ ;
        }

        System.out.println("You got " + correct + " out of 10 correct!");
    }
}