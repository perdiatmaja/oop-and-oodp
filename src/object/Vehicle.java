package object;

public abstract class Vehicle {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public abstract String getDriver();

    public abstract void setDriver(String driver);

    public abstract void startEngine();
}
