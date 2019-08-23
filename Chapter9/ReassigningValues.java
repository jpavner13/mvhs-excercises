public class ReassigningValues {
    public static void main (String[] args) {
        double x = 0 ;
        double answer = (x * x * 3) - (8 * x) + 4;
        System.out.println( "The solution to the Quadratic with an x value of "
            + x + " is: " + answer );

        x = 2 ;
        answer = (x * x * 3) - (8 * x) + 4;
        System.out.println( "The solution to the Quadratic with an x value of "
            + x + " is: " + answer );

        x = 4 ;
        answer = (x * x * 3) - (8 * x) + 4;
        System.out.println( "The solution to the Quadratic with an x value of "
            + x + " is: " + answer );
    }
}