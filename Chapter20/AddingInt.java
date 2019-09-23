import java.util.Scanner ;

public class AddingInt{
    public static void main(String[] args){
        int NumbersAdded = 0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers will be added? ");
        NumbersAdded = scan.nextInt();

        int sum = 0 ;
        int i = 0 ;

        while(i < NumbersAdded){
            System.out.println("Enter an Integer: ");
            int CurrentNum = 0 ;
            CurrentNum = scan.nextInt();
            sum = sum + CurrentNum;
            i++ ;
        }
        
        System.out.println("The sum is: " + sum);
    }
}