import java.util.Scanner ;

public class FantasyGame {

    public static void main(String[] args){

        String name = "" ;
        int Strength = 0 ;
        int Health = 0 ;
        int Luck = 0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Yertle's Quest!");

        System.out.println("Enter the name of your character: ");
        name = scan.nextLine();

        System.out.println("Enter Strength (1-10) :");
        Strength = scan.nextInt();

        System.out.println("Enter Health (1-10) :");
        Health = scan.nextInt();

        System.out.println("Enter Luck (1-10) :");
        Luck = scan.nextInt();

        int total = (Strength + Health + Luck);

        if (total > 15){
            System.out.println("You have made your character too OP");
            System.out.println("Your a dick your character vlaues have been randomly assigned to 1");
        }

    }
}