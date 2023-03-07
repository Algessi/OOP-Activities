// Althea Janine Duran | BSCS-2B
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
      
        System.out.print("Ascending Order: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nDescending Order: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
