package Vehicle;

public class WheeledTransport {
    protected int wheelCount;
    protected double maxSpeed;

    public WheeledTransport(int wheelCount, double maxSpeed) {
        this.wheelCount = wheelCount;
        this.maxSpeed = maxSpeed;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void service() {
        System.out.println("Обслужено колёс - " + wheelCount);
    }
}
