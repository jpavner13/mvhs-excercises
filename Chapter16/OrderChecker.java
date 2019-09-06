import java.util.Scanner ;

public class OrderChecker {

    public static void main(String[] args ){
        int bolts = 0;
        int nuts = 0;
        int washers = 0;
        int cost = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Number of Bolts: ");
        bolts = scan.nextInt();
        System.out.println("Number of Nuts: ");
        nuts = scan.nextInt();
        System.out.println("Number of Washers: ");
        washers = scan.nextInt();

        if (nuts < bolts)
            System.out.println("Check the Order: too few nuts");
        else {
            if ((washers * 2) < bolts)
                System.out.println("Check the order: too few washers");
            else {
            }
        }
        
        cost = (bolts * 5) + (nuts * 3) + (washers);
        System.out.println("Total cost: " + cost);
    }
}