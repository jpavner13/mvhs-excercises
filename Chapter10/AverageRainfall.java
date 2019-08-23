public class AverageRainfall {

    public static void main(String[] args){
        int aprilRain = 12; 
        int mayRain = 14; 
        int juneRain = 8;
        double avgRainfall = (aprilRain + mayRain + juneRain) / 3.0 ;

        System.out.println("\tRainfall for April: " + aprilRain) ;
        System.out.println("\tRainfall for May: " + mayRain) ; 
        System.out.println("\tRainfall in June: " + juneRain) ;
        System.out.println("\tAverage Rainfall: " + avgRainfall) ;
    }
}