import java.util.Scanner;

public class midtermAct2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rate = 100.0;
        System.out.println("Choose an amount per hour:");
        System.out.println("A. 100.00 per hour");
        System.out.println("B. 150.00 per hour");
        System.out.println("C. 200.00 per hour");
        char choice = input.next().charAt(0);
        switch (choice) {
            case 'A':
                rate = 100.0;
                break;
            case 'B':
                rate = 150.0;
                break;
            case 'C':
                rate = 200.0;
                break;
            default: 
        }
        System.out.println("Enter number of hours work:");
        int hoursPerDay = input.nextInt();
        System.out.println("Number of days taken:");
        int daysPerMonth = input.nextInt();
        double totalSalary = rate * hoursPerDay * daysPerMonth;
        System.out.println("Total salary: " + totalSalary);
        double taxRate = 0.0;
        String bracket = "";
        if (totalSalary <= 10000.0) {
            bracket = "A";
        } else if (totalSalary <= 30000.0) {
            bracket = "B";
            taxRate = 0.12;
        } else if (totalSalary <= 50000.0) {
            bracket = "C";
            taxRate = 0.15;
        } else {
            bracket = "D";
            taxRate = 0.25;
        }
        System.out.println("Salary bracket: " + bracket);
        System.out.println("Choose deduction:");
        System.out.println("1. SSS - 500");
        System.out.println("2. Phil Health - 300");
        System.out.println("3. SSS and Phil Health - 800");
        int deductionChoice = input.nextInt();
        double deduction = 0.0;
        switch (deductionChoice) {
            case 1:
                deduction = 500.0;
                break;
            case 2:
                deduction = 300.0;
                break;
            case 3:
                deduction = 800.0;
                break;
            default:
        }
        double tax = totalSalary * taxRate;
        double totalDeduction = tax + deduction;
        double net = totalSalary - totalDeduction;
        System.out.println("Tax:" + tax);
        System.out.println("Total deduction: " + totalDeduction);
        System.out.println("Net: " + net);
    }
}
