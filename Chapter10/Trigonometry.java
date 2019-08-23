public class Trigonometry {

    public static void main(String[] args){
        double value = 0.5236   ;
        double sinAnswer = 0 ;
        double cosAnswer = 0 ;
        double combineAnswer = 0 ;

        sinAnswer = Math.sin( value );
        cosAnswer = Math.cos( value );
        
        combineAnswer = (sinAnswer * sinAnswer) + (cosAnswer * cosAnswer);

        System.out.println("The Sin of " + value + " is: " + sinAnswer);
        System.out.println("The Cos of " + value + " is: " + cosAnswer);
        System.out.println("The combined squares of " + sinAnswer + "and " + cosAnswer + " is: " + combineAnswer);
    }
}