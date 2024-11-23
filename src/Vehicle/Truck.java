package Vehicle;

public class Truck extends MotorTransport {
    private int loadCapacity;

    public Truck(int wheelCount, double maxSpeed, String engineType, int loadCapacity) {
        super(wheelCount, maxSpeed, engineType);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + getWheelCount());
        System.out.println("Обслужен двигатель типа \"" + getEngineType() + "\"");
        System.out.println("Грузоподъёмность грузовика: " + loadCapacity + " тонн");
    }
}
