package Vehicle;

public class Car extends MotorTransport{

    private String carBrand;
    private String carModel;

    public Car(int wheelCount, int maxSpeed, String motorType, String carBrand, String carModel) {
        super(wheelCount, maxSpeed, motorType);
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + getWheelCount());
        System.out.println("Марка - " + carBrand);
        System.out.println("Модель - " + carModel);
        System.out.println("Обслужен двигатель типа \"" + getMotorType() + "\"");
    }
}
