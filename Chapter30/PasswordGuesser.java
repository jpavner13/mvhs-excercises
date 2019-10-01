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
            tries += 1 ;
            String current = "";

            int i = 0;
            while(i <= 5){
            i += 1 ;
                if (current.equals(userin)){
                    correct = true ;
                    password = current;
                }
            char x = (char)(rand.nextInt(26) + 'a');
            current = current + x ;
            // System.out.println(current);
            }
        }

        System.out.println("Your password is: " + password);
        System.out.println("It took " + tries + " tries.");
    }
}