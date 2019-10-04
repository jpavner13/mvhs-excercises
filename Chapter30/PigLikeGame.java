import java.util.* ;

public class PigLikeGame{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int compScore = 0 ;
        int userScore = 0;

        boolean playing = true ;

        int previousRoll = 10 ;

        while(playing){
            int roundScore = 0 ;
            String rollAgain = "" ;

            System.out.println(previousRoll);

            if (previousRoll <= 1 ){
                playing = false ;
                System.out.println("End");
            } else {
                System.out.println("Roll Again? y --> yes    n --> no.");
                rollAgain = scan.nextLine();

                if (rollAgain.equals("y")){
                    int roll = rand.nextInt(6) + 1 ;
                    System.out.println("Your roll is: " + roll);
                    roundScore = roundScore + roll ;
                    previousRoll = roll ;
            } else {
                    userScore = userScore + roundScore ;
                    playing = false ;
                }

            }

            if (playing){
                userScore = roundScore + userScore ;
            } else {
                userScore = userScore - roundScore;
            }
        }
        
        System.out.println(userScore);
    }
}