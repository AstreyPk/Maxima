package Vehicle;

public class Bicycle extends WheeledTransport {
    protected String bicycleType;

    public Bicycle(int wheelCount, double maxSpeed, String bicycleType) {
        super(wheelCount, maxSpeed);
        this.bicycleType = bicycleType;
    }

    public String getBicycleType() {
        return bicycleType;
    }
    public void setBicycleType(String bicycleType) {
        this.bicycleType = bicycleType;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + wheelCount);
        System.out.println("Обслужен велосипед типа \"" + bicycleType + "\"");
    }
}