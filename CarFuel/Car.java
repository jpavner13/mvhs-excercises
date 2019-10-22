public class Car{

    private String model ;
    private String type ;
    private int tankSize ;
    private double time ;

    public Car(String model, String type, int tankSize, double time){
        this.model = model ;
        this.type = type ;
        this.tankSize = tankSize ;
        this.time = time ;
    }

    public String getModel(){
        return this.model;
    }

    public String gettype(){
        return this.type;
    }

    public int getTankSize(){
        return this.tankSize;
    }

    public double getTime(){
        return this.time;
    }

    public double calculateGasMilage(){
        double gasmilage ;

        double distance = (60 * this.time);

        return (distance / this.tankSize);
    }
}