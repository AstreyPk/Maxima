public class recursion {
    // подсчет суммы чисел от 1 до n
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Рекурсия для подсчета суммы чисел от 1 до n
    public static int recursionSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + recursionSum(n - 1);
        }
    }

    public static void main(String[] args) {
        // Пример использования обычного метода
        System.out.println("Сумма чисел от 1 до 10 с использованием обычного метода: " + sum(10));

        // Пример использования рекурсивного метода
        System.out.println("Сумма чисел от 1 до 10 с использованием рекурсивного метода: " + recursionSum(10));
    }
}
