package Vehicle;

public class MotorTransport extends WheeledTransport{
    private String motorType;
    public MotorTransport(int wheelCount, int maxSpeed, String motorType) {
        super(wheelCount, maxSpeed);
        this.motorType = motorType;

    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + getWheelCount());
        System.out.println("Обслужен двигатель типа  - " + motorType);
    }
}
