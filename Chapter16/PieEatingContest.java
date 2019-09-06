import java.util.Scanner ;

public class PieEatingContest{

    public static void main(String[] args){
        int weight = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your weight: ");
        weight = scan.nextInt();

        if ((weight >= 220) && (weight <= 280))
            System.out.println("You can compete!");
        else
            System.out.println("You can not compete.");
    }
}