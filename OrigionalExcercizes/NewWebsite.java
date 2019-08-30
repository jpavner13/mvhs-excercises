import java.util.Scanner ;

public class NewWebsite {

    public static void main(String[] args){
        String username, password ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the new website!");

        System.out.println("Enter your new username: ");
        username = scan.nextLine();

        System.out.println("Enter your new password: ");
        password = scan.nextLine();

        int passwordLength = password.length() - 2 ;

        if (password.substring(0, 1) == "a" || password.substring(0,1) == "e" || password.substring(0,1) == "i" || password.substring(0,1) == "o" || password.substring(0,1) == "u")
            if (password.contains("#") || password.contains("!") || password.contains("$") || password.contains("&"))
                if (password.contains(username) == false)
                    if (password.substring(0, passwordLength).matches(".*\\d.*"))
                        System.out.println("Password Works!");
                    else
                        System.out.println("Password can only contain integers as the last two didgets");
                else
                    System.out.println("Password must not contain username");
            else
                System.out.println("Password must contain: #, !, $, or &");
        else
            System.out.println("Password must follow all rules.");
    }
}