import java.util.Scanner ;
import java.util.Random ;

public class GuessingGame{
    public static void main(String[] args){

        int userin = 0;
        int compNum = 0;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        compNum = rand.nextInt(10);

        boolean correct = false ;

        int i = 0 ;
        while (i < 3 && !correct){
            System.out.println("Im thinking of a number 1- 10. You must guess in three tries:");
            userin = scan.nextInt();
            if (userin == compNum){
                i += 1 ;
                System.out.println("Right! You have won the game!");
                correct = true ;
            } else {
                i += 1 ;
                System.out.println("Wrong.");
                correct = false ;
            }
        }

        System.out.println("The correct answer was " + compNum);
    }
}