import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос года выпуска
        System.out.println("Введите марку автомобиля");
        String name = scanner.nextLine();

        // Запрос марки автомобиля
        System.out.println("Введите год выпуска автомобиля ...");
        int age = scanner.nextInt();

        // Вывод сообщения
        System.out.println("Год выпуска авто - " + age + " Марка авто - " + name);

        scanner.close();
    }
}
