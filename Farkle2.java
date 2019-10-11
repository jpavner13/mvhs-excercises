import java.util.* ;

public class Farkle2 {

    public static void main(String[] args){

        System.out.println("Welcome to farkle! Players sign in!");

        String player1 = playersignin();
        String player2 = playersignin();

        int currentplayer = WhoGoesFirst(player1, player2);

        String roundPlayer = "" ;

        if (currentplayer == 1){
            roundPlayer = player1 ;
        } else {
            roundPlayer = player2 ;
        }

        int player1score = 0 ;
        int player2score = 0 ;

        int roundsPlayed = 0 ;

        PlayRound(player1, player1score, player2score);
    }

    public static String playersignin(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Next Player: ");
        String player = scan.nextLine();
        return player ;
    }

    public static int WhoGoesFirst(String player1, String player2){
        Scanner scan = new Scanner(System.in);

        System.out.println("");
        System.out.println(player1 +  ", press enter to roll to see who goes first.");
        String useless = scan.nextLine();
        int oneroll = RollDie();
        System.out.println(player1 + ", your roll is: " + oneroll);
        System.out.println("");

        System.out.println(player2 + ", your turn. Press enter to roll");
        useless = scan.nextLine();
        int tworoll = RollDie();
        System.out.println("Your roll is: " + tworoll);

        if (oneroll > tworoll){
            System.out.println("");
            System.out.println(player1 + ", you go first.");
            return 1 ;
        } else {
            System.out.println("");
            System.out.println(player2 + ", you go first.");
            return 2 ;
        }
    }

    public static int RollDie(){
        Random randroll = new Random();
        int roll = randroll.nextInt(6) + 1;
        return roll ;
    }

    public static boolean isFarkle(int rolls[]){
        Boolean isIt = true;
        for(int i = 0; i < rolls.length; i++){
            if(rolls[i] == 5 || rolls[i] == 1){
                isIt = false ;
            } 
        }
        return isIt ;
    }

    public static int PlayRound(String player, int player1score, int player2score){
        Scanner scan = new Scanner(System.in);
        System.out.println("Roll the dice. Press Enter to roll.");
        String useless = scan.nextLine();

        int finalRoundScore = 0 ;

        int diceLeft = 6;
        int noScore = 0;

        int rolls[] = new int[6];
        for(int i = 0; i < rolls.length; i++){
            rolls[i] = RollDie();
        }

        if(isFarkle(rolls)){
            for(int i = 0; i < rolls.length; i++){
                System.out.println("Farkle!");
                System.out.println("Roll = " + rolls[i]);
            }
        }

        for(int i = 0; i < rolls.length; i++){
            if(rolls[i] == 5 || rolls[i] == 1){
                if(rolls[i] == 5){
                    finalRoundScore += 500;
                    diceLeft-- ;
                    rolls[i] = -1 ;
                } else {
                    finalRoundScore += 100;
                    diceLeft-- ;
                    rolls[i] = -1 ;
                }
            } else {
                noScore++ ;
            }

            System.out.println("Roll: " + rolls[i]);     
            System.out.println("Score: " + finalRoundScore);  
            System.out.println("");  
        }
        return(1);

    }
}