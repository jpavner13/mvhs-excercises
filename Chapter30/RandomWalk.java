import java.util.* ;

public class RandomWalk{
    public static void main(String[] args){
        double x = 0 ;
        double y = 0 ;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many steps do you want to take?");
        int steps = scan.nextInt();

        int i = 0 ;

        while (i < steps){
            i++ ;
            x = x + (rand.nextDouble() * 2) - 1;
            y = y + (rand.nextDouble() * 2) - 1;
        }

        double together = Math.pow(x, 2) + Math.pow(y, 2);
        double distance = Math.sqrt(together);

        System.out.println("You are now at: (" + x + ", " + y + ").");
        System.out.println("You are " + distance + " units from the origin.");
    }
}