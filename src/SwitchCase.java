import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();
        scanner.close();

        switch (operator) {
            case "+":
                int result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.print(result);
                } else {
                    System.out.print("Деление на ноль невозможно ");
                }
                break;


        }
    }
}
