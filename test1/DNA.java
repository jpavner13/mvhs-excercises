import java.util.Scanner ;

public class DNA{
    public static void main(String[] args){
        String userin = " ";
        Scanner scan = new Scanner(System.in);
        String oneVal = "";

        while(userin.substring((userin.length()) - 1, userin.length()) != "q"){
            System.out.println("Enter first neuleotyde letter. q to stop:");
            System.out.println(userin.substring((userin.length()) - 1, userin.length()));
            oneVal = scan.nextLine();
            userin = (userin + oneVal);
        }
        System.out.println(userin.substring(0, (userin.length() - 1)));
        String dna = userin;
    }
}