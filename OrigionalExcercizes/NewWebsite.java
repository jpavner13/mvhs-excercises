import java.util.Scanner ;

public class NewWebsite {

    public static void main(String[] args){
        String username, password ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the new website!");

        System.out.println("Enter your new username: ");
        username = scan.nextLine();

            if (username.equals("admin") || username.equals("person") || username.equals("jimbob234") || username.equals("skater_gurl117") || username.equals("gary"))
                System.out.println("Must create an origional username.");
            else {
                System.out.println("Username Works!");

                System.out.println("Enter your new password: ");
                password = scan.nextLine();

                int passwordLength = password.length() - 2 ;
                String password_letter = password.substring(0, 1);
                String minus_two = password.substring(passwordLength, passwordLength);

                if (password_letter.equals("a") || password_letter.equals("e") || password_letter.equals("i") || password_letter.equals("o") || password_letter.equals("u"))
                    if (password.contains("#") || password.contains("!") || password.contains("$") || password.contains("&"))
                        if (password.contains(username) == false)
                            if (minus_two.matches(".*\\d.*"))
                                System.out.println("Password can only contain integers as the last two didgets");
                            else
                                System.out.println("Password Works!");
                        else
                            System.out.println("Password must not contain username");
                    else
                        System.out.println("Password must contain: #, !, $, or &");
                else
                    System.out.println("Password must start with a vowel.");
            }
                
    }
}