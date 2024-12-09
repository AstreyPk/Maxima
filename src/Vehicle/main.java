package Vehicle;

public class main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(2, 30, "горный");
        Car car = new Car(4, 200, "бензиновый", "TOYOTA", "MARKII");
        Truck truck = new Truck(4, 120, "дизельный", 7);

        visitServiceStation(bicycle);
        visitServiceStation(car);
        visitServiceStation(truck);
    }

    protected static void visitServiceStation(WheeledTransport transport) {
        transport.service();
    }
}
