package Vehicle;

public class Car extends MotorTransport {
    protected String make;
    protected String model;

    public Car(int wheelCount, double maxSpeed, String engineType, String make, String model) {
        super(wheelCount, maxSpeed, engineType);
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + wheelCount);
        System.out.println("Обслужен двигатель типа \"" + engineType + "\"");
        System.out.println("Марка автомобиля: " + make);
        System.out.println("Модель автомобиля: " + model);
    }
}
