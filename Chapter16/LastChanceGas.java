import java.util.Scanner ;

public class LastChanceGas {

    public static void main(String[] args){
        double tankCapacity = 0.0 ;
        double gagePersentage = 0.0 ;
        double milesGallon = 0.0 ;

        Scanner scan = new Scanner(System.in);

        System.out.println("Tank Capacity: ");
        tankCapacity = scan.nextInt();
        System.out.println("Gage Reading: ");
        gagePersentage = scan.nextInt();
        System.out.println("Miles per Gallon: ");
        milesGallon = scan.nextInt();

        if ((((tankCapacity / 100) * gagePersentage) * milesGallon) > 200)
            System.out.println("Safe to Proceed");
        else
            System.out.println("Get gas!");
    }
}