import java.util.Scanner ;

public class DiscountPrices {

    public static void main(String[] args){
        int cost = 0 ;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the cost of the item? ");
        cost = scan.nextInt();

        if (cost >= 10000) {
            int discount = (cost / 100) * 90 ;
            System.out.println("The discounted price is " + discount);

        } else {
            System.out.println("The item is less than $10");
        }
    }
}