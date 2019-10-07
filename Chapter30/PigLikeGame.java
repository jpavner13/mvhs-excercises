import java.util.* ;

public class PigLikeGame{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int compScore = 0 ;
        int userScore = 0;

        boolean playing = true ;

        int previousRoll = 10 ;
        int roundScore = 0 ;

        while(playing){
            String rollAgain = "" ;

            if (previousRoll <= 1 ){
                roundScore = 0;
                int x = 0;
                    int diceroll = 0 ;
                    while (x <= 3){
                        diceroll = rand.nextInt(6) + diceroll;
                        x++ ;
                    }
                    compScore = compScore + diceroll ;
                    System.out.println("The computer rolled a total of: " + diceroll);
                    System.out.println("");
                    previousRoll = 10 ;
            } else {
                System.out.println("Roll Again? y --> yes    n --> no.");
                rollAgain = scan.nextLine();

                if (rollAgain.equals("y")){
                    int roll = rand.nextInt(6) + 1 ;
                    System.out.println("Your roll is: " + roll);
                    System.out.println("");
                    roundScore = roundScore + roll ;
                    previousRoll = roll ;
                    roundScore = roundScore + roll ;
                } else {
                    userScore = userScore + roundScore ;
                    roundScore = 0;
                    int x = 0;
                    int diceroll = 0 ;
                    while (x <= 3){
                        diceroll = rand.nextInt(6) + diceroll;
                        x++ ;
                    }
                    compScore = compScore + diceroll ;
                    System.out.println("The computer rolled a total of: " + diceroll);
                    System.out.println("");
                }

            }

            if (userScore >= 100){
                System.out.println("User wins! Their score is: " + userScore);
                System.out.println("Computer score is: " + compScore);
                playing = false;
            }

            if (compScore >= 100){
                System.out.println("Computer wins! Their score is: " + compScore);
                System.out.println("User score is: " + userScore);
                playing = false;
            }
        }
        
    }
}