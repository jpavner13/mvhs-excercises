import java.util.* ;

public class PasswordGuesser{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 'Secret' password--> ");
        String userin = scan.nextLine();

        Random rand = new Random();

        String password = "";

        boolean correct = false;

        int tries = 0;

        while(!correct){
            String current = "";
            current += chara.charAt(random.nextInt(chara.length));
        }

        System.out.println("Your password is: " + password);
        System.out.println("It took " + tries + " tries.");
    }
}