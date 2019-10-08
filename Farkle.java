import java.util.* ;

public class Farkle {

    public static void main(String[] args){

        System.out.println("Welcome to farkle! Players sign in!");

        String player1 = playersignin();
        String player2 = playersignin();

        int currentplayer = WhoGoesFirst(player1, player2);

        String roundPlayer = ""

        if (currentplayer == 1){
            roundplayer = player1 ;
        } else {
            roundplayer = player2 ;
        }

        int player1score = 0 ;
        int player2score = 0 ;

        while (player1score < 100 || player2score < 100){
            PlayRound()
        }
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
        int roll = randroll.nextInt(6);
        
        return roll ;
    }

    public static int PlayRound(String player){

    }
}