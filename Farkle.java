import java.util.* ;

public class Farkle {

    public static void main(String[] args){

        System.out.println("Welcome to farkle! Players sign in sdjfsdjf!");

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

    public static int PlayRound(String player, int player1score, int player2score){
        int totalScore = 0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Roll the dice! Press enter to roll.");
        String useless = scan.nextLine();

        int diceLeft = 6 ;

        while(diceLeft != 0){

            int roll1 = 0 ;
            int roll2 = 0 ;
            int roll3 = 0 ;
            int roll4 = 0 ;
            int roll5 = 0 ;
            int roll6 = 0 ;

            if (diceLeft == 6){ 
                roll1 = RollDie();
                roll2 = RollDie();
                roll3 = RollDie();
                roll4 = RollDie();
                roll5 = RollDie();
                roll6 = RollDie();

                if (roll1 == 5 || roll1 == 1){
                    totalScore = totalScore + roll1;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll2 == 5 || roll2 == 1){
                    totalScore = totalScore + roll2;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll3 == 5 || roll3 == 1){
                    totalScore = totalScore + roll3;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll4 == 5 || roll4 == 1){
                    totalScore = totalScore + roll4;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll5 == 5 || roll5 == 1){
                    totalScore = totalScore + roll5;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll6 == 5 || roll6 == 1){
                    totalScore = totalScore + roll6;
                    diceLeft = diceLeft - 1 ;
                }
            }

            if (diceLeft == 5){ 
                roll1 = RollDie();
                roll2 = RollDie();
                roll3 = RollDie();
                roll4 = RollDie();
                roll5 = RollDie();

                if (roll1 == 5 || roll1 == 1){
                    totalScore = totalScore + roll1;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll2 == 5 || roll2 == 1){
                    totalScore = totalScore + roll2;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll3 == 5 || roll3 == 1){
                    totalScore = totalScore + roll3;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll4 == 5 || roll4 == 1){
                    totalScore = totalScore + roll4;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll5 == 5 || roll5 == 1){
                    totalScore = totalScore + roll5;
                    diceLeft = diceLeft - 1 ;
                }
            }

            if (diceLeft == 4){ 
                roll1 = RollDie();
                roll2 = RollDie();
                roll3 = RollDie();
                roll4 = RollDie();

                if (roll1 == 5 || roll1 == 1){
                    totalScore = totalScore + roll1;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll2 == 5 || roll2 == 1){
                    totalScore = totalScore + roll2;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll3 == 5 || roll3 == 1){
                    totalScore = totalScore + roll3;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll4 == 5 || roll4 == 1){
                    totalScore = totalScore + roll4;
                    diceLeft = diceLeft - 1 ;
                }
            }

            if (diceLeft == 3){ 
                roll1 = RollDie();
                roll2 = RollDie();
                roll3 = RollDie();

                if (roll1 == 5 || roll1 == 1){
                    totalScore = totalScore + roll1;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll2 == 5 || roll2 == 1){
                    totalScore = totalScore + roll2;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll3 == 5 || roll3 == 1){
                    totalScore = totalScore + roll3;
                    diceLeft = diceLeft - 1 ;
                }
            }

            if (diceLeft == 2){ 
                roll1 = RollDie();
                roll2 = RollDie();

                if (roll1 == 5 || roll1 == 1){
                    totalScore = totalScore + roll1;
                    diceLeft = diceLeft - 1 ;
                }

                if (roll2 == 5 || roll2 == 1){
                    totalScore = totalScore + roll2;
                    diceLeft = diceLeft - 1 ;
                }
            }

            if (diceLeft == 1){ 
                roll1 = RollDie();

                if (roll1 == 5 || roll1 == 1){
                    totalScore = totalScore + roll1;
                    diceLeft = diceLeft - 1 ;
                }

            }
            System.out.println(roll1);
            System.out.println(roll2);
            System.out.println(roll3);
            System.out.println(roll4);
            System.out.println(roll5);
            System.out.println(roll6);
            System.out.println("diceleft " + diceLeft);
        }

        System.out.println(diceLeft);
        System.out.println(totalScore);

        return totalScore;
    }
}