import java.util.Scanner;

public class CafeMenu{
    
    public static Scanner input = new Scanner(System.in);
    public static double foodTotal = 0;
    public static double drinkTotal = 0;
    
    public static void main(String[] args) {
        displayMenu();
    }
    
    public static void displayMenu() {
        System.out.println("\tFLAVORED CUP CAKES");
        System.out.println("FLAVOR\t\tCOST");
        System.out.println("[A]\tCHOCOLATE\t25.0");
        System.out.println("[B]\tRAISINS\t\t50.0");
        System.out.println("[C]\tPINEAPPLE\t40.0");
        System.out.println("[D]\tAPPLE\t\t30.0");
        System.out.println("[E]\tMANGO\t\t35.0");
        System.out.println("[F]\tBANANA\t\t45.0");
        orderFood();
    }
    
    public static void orderFood() {
        while (true) {
            System.out.print("\nCHOOSE FLAVOR: ");
            String flavor = input.nextLine();
            double cost = 0;
            switch (flavor.toUpperCase()) {
                case "A":
                    cost = 25.0;
                    break;
                case "B":
                    cost = 50.0;
                    break;
                case "C":
                    cost = 40.0;
                    break;
                case "D":
                    cost = 30.0;
                    break;
                case "E":
                    cost = 35.0;
                    break;
                case "F":
                    cost = 45.0;
                    break;
                default:
                    System.out.println("Invalid flavor.");
                    continue;
            }
            System.out.print("QUANTITY: ");
            int quantity = input.nextInt();
            double subtotal = cost * quantity;
            System.out.printf("SUBTOTAL: %.2f\n", subtotal);
            foodTotal += subtotal;
            input.nextLine(); // consume the newline character
            System.out.print("ANOTHER [Y/N]: ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                break;
            }
        }
        displayDrinkMenu();
    }
    
    public static void displayDrinkMenu() {
        System.out.println("\n\tGLASS OF DRINKS");
        System.out.println("FLAVOR\t\tCOST");
        System.out.println("[1]\tSOFTDRINKS\t25.0");
        System.out.println("[2]\tICED TEA\t50.0");
        System.out.println("[3]\tCOFFEE\t\t40.0");
        System.out.println("[4]\tAPPLE JUICE\t30.0");
        System.out.println("[5]\tMANGO JUICE\t35.0");
        System.out.println("[6]\tPINEAPPLE JUICE\t45.0");
        orderDrink();
    }
    
    public static void orderDrink() {
        while (true) {
            System.out.print("\nCHOOSE FLAVOR: ");
            String flavor = input.nextLine();
            double cost = 0;
            switch (flavor) {
                case "1":
                    cost = 25.0;
                    break;
                case "2":
                    cost = 50.0;
                    break;
                case "3":
                    cost = 40.0;
                    break;
                case "4":
                    cost = 30.0;
                    break;
                case "5":
                    cost = 35.0;
                    break;
                case "6":
                    cost = 45.0;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid flavor.");
                    continue;
            }
            System.out.print("QUANTITY: ");
            int quantity = input.nextInt();
            double subtotal = cost * quantity;
            System.out.printf("SUBTOTAL: %.2f\n", subtotal);
            drinkTotal += subtotal;
            input.nextLine();
            System.out.print("ANOTHER [Y/N]: ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("N")) {
                break;
            
            }
            
        }
        // Calculate total cost and amount due
        double totalCost = foodTotal + drinkTotal;
        System.out.println("Total Cost: " + totalCost);
        System.out.println("--------------------------");
        System.out.println("\t SUMMARY");
        System.out.println("FOOD: " + foodTotal);
        System.out.println("DRINKS: " + drinkTotal);
        System.out.println("--------------------------");
        double amountDue = totalCost;
        System.out.println("AMOUNT DUE: " + amountDue);

    }
}
