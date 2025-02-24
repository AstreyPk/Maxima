package Vehicle;

public class main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(2, 30, "горный");
        Car car = new Car(4, 240, "бинзиновый", "Lexus", "ls430");
        Truck truck = new Truck(6, 180, "дизельный", 14);
        visitServiceStation(bicycle);
        visitServiceStation(car);
        visitServiceStation(truck);
    }

    public static void visitServiceStation(WheeledTransport transport)
    {
        transport.service();
    }
}
