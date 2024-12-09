package Vehicle;

public class MotorTransport extends WheeledTransport {
    protected String engineType;

    public MotorTransport(int wheelCount, double maxSpeed, String engineType) {
        super(wheelCount, maxSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + wheelCount);
        System.out.println("Обслужен двигатель типа \"" + engineType + "\"");
    }
}
