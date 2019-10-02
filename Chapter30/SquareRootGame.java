import java.util.* ;

public class SquareRootGame{
    public static void main(String[] args){
        Random rand = new Random();

        Scanner scan = new Scanner(System.in);

        System.out.print("Player 1 sign in -->  ");
        String player1 = scan.nextLine();

        System.out.print("Player 2 sign in -->  ");
        String player2 = scan.nextLine();

        System.out.print("How many rounds would you like to play? -->  ");
        int rounds = scan.nextInt();

        System.out.println(" ");

        int i = 0 ;

        int points1 = 0 ;
        int points2 = 0 ;

        while(i < rounds){
            i++ ;

            double number = rand.nextDouble() * 100 ;
            double answer = Math.sqrt(number);

            System.out.println("What is the square root of " + number + "?");

            double guess1 = 0;
            double guess2 = 0;

            if (i % 2 == 1){
                System.out.print(player1 + " guess -->  ");
                guess1 = scan.nextDouble() ;
                System.out.print(player2 + " guess -->  ");
                guess2 = scan.nextDouble() ;
            } else {
                System.out.print(player2 + " guess -->  ");
                guess2 = scan.nextDouble() ;
                System.out.print(player1 + " guess -->  ");
                guess1 = scan.nextDouble() ;
            }

            double distance1 = Math.abs((answer - guess1));
            double distance2 = Math.abs((answer - guess2));

            if (distance1 < distance2){
                System.out.println("The real answer is " + answer);
                System.out.println(player1 + " is " + distance1 + " away.");
                System.out.println(player2 + " is " + distance2 + " away.");
                System.out.println(player1 + " Wins!");
                points1++ ;
                System.out.println(" ");
            } else {
                System.out.println("The real answer is " + answer);
                System.out.println(player1 + " is " + distance1 + " away.");
                System.out.println(player2 + " is " + distance2 + " away.");
                System.out.println(player2 + " Wins!");
                points2++ ;
                System.out.println(" ");
            }
        }

        System.out.println("----- Final Score -----");
        System.out.println(player1 + ": " + points1 + "     " + player2 + ": " + points2);
    }
}