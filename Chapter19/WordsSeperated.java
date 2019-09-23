import java.util.Scanner ;

public class WordsSeperated {
    public static void main(String[] args){
        int IntitialLength = 0;
        String FirstWord = " " ;
        String SecondWord = " ";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word: ");
        FirstWord = scan.nextLine();

        System.out.println("Enter second word: ");
        SecondWord = scan.nextLine();

        IntitialLength = FirstWord.length() + SecondWord.length();

        int i = IntitialLength ;
        String dots = "";

        while(i < 30){
            dots = dots + ".";
            i = i + 1 ;
        }
        
        System.out.println(FirstWord + dots + SecondWord);
    }
}