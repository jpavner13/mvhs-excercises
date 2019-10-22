public class FitStandard{

    public static void main(String[] args) {

        Car car1 = new Car("Takk" , "Sedan" , 50 , 8.0);
        Car car2 = new Car("Beklager" , "Sedan" , 40 , 7.5);
        Car car3 = new Car("Vakker" , "SUV" , 60 , 5.0);
        Car car4 = new Car("Stygg" , "SUV" , 55 , 6.0);
        Car car5 = new Car("Vanskellig" , "Truck" , 65 , 4.75);
        Car car6 = new Car("Lastebil" , "Truck" , 70 , 5.5);

        System.out.println(car1.calculateGasMilage());
        System.out.println(car2.calculateGasMilage());
        System.out.println(car3.calculateGasMilage());
        System.out.println(car4.calculateGasMilage());
        System.out.println(car5.calculateGasMilage());
        System.out.println(car6.calculateGasMilage());
    }
}