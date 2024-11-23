import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0; // Инициализируем переменную для хранения суммы
        boolean a = true; // Проверяем, является ли число положительным

        while (a) {// Цикл продолжается, пока пользователь вводит положительное число
            System.out.println("Введите число");
            int n = scanner.nextInt();

            if (n > 0) { // Если число положительное
                sum += n; // Добавляем число к сумме
            } else { // Если число отрицательное
                a = false; // выйти из цикла
            }
        }
        System.out.println("Общая сумма положительных чисел: " + sum); // Выводим сумму
    }
}
