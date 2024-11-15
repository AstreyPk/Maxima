public class recursiveFactorial {

    public static long factorial(int number){
        long result = 1;
        for (int i = number; i >= 1; i--){
            result = result * i;
        }
        return result;
    }
    public static int recursiveFactorial(int number){
        if (number <= 1) return 1;
        return number * recursiveFactorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Факториал числа 5 обычным методом: " + factorial(5));
        System.out.println("Факториал числа 5 рекурсивным методом: " + recursiveFactorial(5));
    }
}
