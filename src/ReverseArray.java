import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter the size of the array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20.");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter the " + i + " element: ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reversed array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
