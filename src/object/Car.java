package object;

public class Car extends Vehicle {
    private String CarDriver;

    public Car(){
        setDriver("Sim A");
    }

    @Override
    public String getDriver() {
        return CarDriver;
    }

    @Override
    public void setDriver(String driver) {
        CarDriver = driver;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric Start");
    }
}
