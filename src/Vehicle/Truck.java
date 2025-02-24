package Vehicle;

public class Truck extends MotorTransport{
    private int loadCapacity;
    public Truck(int wheelCount, int maxSpeed, String motorType, int loadCapacity) {
        super(wheelCount, maxSpeed, motorType);
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
        System.out.println("Обслужен двигатель типа \"" + getMotorType() + "\"");
        System.out.println("Грузоподъемность грузовика - " + loadCapacity + " тонн");
    }
}
