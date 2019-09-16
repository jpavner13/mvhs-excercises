import java.util.Scanner ;

public class InternetDelicatessen {

    public static void main(String[] args) {
        double price = 0.0;
        String item = "" ;
        double delivery = 0.0 ;

        Scanner scan = new Scanner(System.in) ;

        System.out.print("Enter the item: ");
        item = scan.nextLine();

        System.out.print("Enter the price: ");
        price = scan.nextDouble();
        price = price * 100 ;

        System.out.print("Overnight delivery (0==no, 1==yes): ");
        delivery = scan.nextInt();

        double total = 0.0 ;
        double deliveryCost = 0.0 ;

        if (delivery == 1){
            if (price <= 10000){
                deliveryCost = deliveryCost + 1300;
            } else {
                deliveryCost = deliveryCost + 500;
            }
        } else {
            if (price <= 10000){
                deliveryCost = deliveryCost + 10000;
            } else {
                deliveryCost = deliveryCost + 200;
            }
        }

        total = price + deliveryCost ;

        System.out.println("Invoice:");
        System.out.println("\t"+ item + "       " + (price / 100));
        System.out.println("\t" + "delivery         " + (deliveryCost / 100));
        System.out.println("\t" + "total            " + (total / 100));
    }
}