import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileInputStream("input.txt"))) {
            int n = sc.nextInt();
            int array[] = new int[n];
            int array2[];

            array = arrayInit(sc, n, array);

            System.out.println("Начальный массив: ");
            printArray(array);

            System.out.println("\nКонечный массив: ");
            array2 = arrayReverse(n, array);
            printArray(array2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void printArray(int[] array) {
        for(int i : array){
            System.out.printf("%d ", i);
        }
    }

    private static int[] arrayReverse(int n, int[] array) {
        int i;
        int temp;
        for (i = 0; i < n / 2; i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        return array;
    }

    private static int[] arrayInit(Scanner sc, int n, int[] array) {
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }
}
