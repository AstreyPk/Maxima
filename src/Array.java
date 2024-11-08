import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Объявляем сканнер
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 5 чисел");

        //Массив их пяти элементов
        int[] arr = new int[5];

        //Заполняем массив числами из консоли
        for (int i=0; i<5; i++){
            arr[i] = scanner.nextInt();
        }
        //Сортируем массив
        Arrays.sort(arr);

        //Выводим массив в консоль
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
