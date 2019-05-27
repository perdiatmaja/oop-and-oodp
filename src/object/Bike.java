package object;

public class Bike extends Vehicle {
    private String BikeDriver;

    public Bike(){
        setDriver("Sim C");
    }

    @Override
    public String getDriver() {
        return BikeDriver;
    }

    @Override
    public void setDriver(String driver) {
        BikeDriver = driver;
    }

    @Override
    public void startEngine() {
        System.out.println("Kick Starter");
    }
}
