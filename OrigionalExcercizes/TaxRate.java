import java.util.Scanner ;

public class TaxRate {

    public static void main(String[] args){
        float taxRate = 0 ;
        double income = 0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your income? ");
        income = scan.nextInt();

        double totalTax = 0 ;

        if (income >= 10500000) {
            System.out.println("Youre a GOD!");
        } else {
            if (income >= 1050000){
                totalTax = totalTax + ((income - 105000) * 0.22 );
                income = income - (income - 1050000);
                System.out.println(income);
                System.out.println(totalTax);
            }
            if (income >= 650000){
                totalTax = totalTax + ((income % 650000) * 0.19 );
                income = income - (income % 650000);
                System.out.println(income);
            }
            if (income >= 350000){
                totalTax = totalTax + ((income % 350000) * 0.16 );
                income = income - (income % 350000);
                System.out.println(income);
            }
            if (income >= 150000){
                totalTax = totalTax + ((income % 150000) * 0.10 );
                income = income - (income % 150000);
            }
            System.out.println(totalTax);
        }
    }
}