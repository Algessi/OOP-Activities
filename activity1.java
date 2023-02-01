import java.util.Scanner;
public class activity1 {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);

        System.out.print("Input first number: ");
        int firstValue = values.nextInt();

        System.out.print("Input second number: ");
        int secondValue = values.nextInt();

        int result = firstValue + secondValue;
        String binary1 = Integer.toBinaryString(firstValue);
        String binary2 = Integer.toBinaryString(secondValue);
        String binaryAns = Integer.toBinaryString(result);

        System.out.println(firstValue + " = " + binary1);
        System.out.println(secondValue + " = " + binary2);
        System.out.println(result + " = " + binaryAns);   
    }
    }


 

