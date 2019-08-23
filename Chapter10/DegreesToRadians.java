public class DegreesToRadians {

    public static void main(String[] args){
        double degrees = 30 ;
        double rad = 0 ;
        
        rad = degrees * Math.PI / 180 ;

        double sinAnswer = 0 ;
        double cosAnswer = 0 ;
        double combineAnswer = 0 ;

        sinAnswer = Math.sin( rad );
        cosAnswer = Math.cos( rad );
        
        combineAnswer = (sinAnswer * sinAnswer) + (cosAnswer * cosAnswer);

        System.out.println("The Sin of " + rad + " is: " + sinAnswer);
        System.out.println("The Cos of " + rad + " is: " + cosAnswer);
        System.out.println("The combined squares of " + sinAnswer + "and " + cosAnswer + " is: " + combineAnswer);
    }
}