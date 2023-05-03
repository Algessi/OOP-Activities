import java.util.Scanner;

abstract class Menu {
    protected String[] flavor;
    protected double[] cost;

    Menu(String[] flavor, double[] cost) {
        this.flavor = flavor;
        this.cost = cost;
    }

    abstract String getMenuName();

    void displayMenu() {
        System.out.println("\t\t" + getMenuName() + "\nFLAVOR\t\t\t\tCOST");
        for(int i = 0; i < flavor.length; i++) {
            System.out.printf("[%d]\t%-20s\t%.2f\n", i+1, flavor[i], cost[i]);
        }
    }

    double getCost(int choice, int quantity) {
        return cost[choice-1] * quantity;
    }
}

class CupcakeMenu extends Menu {
    CupcakeMenu(String[] flavor, double[] cost) {
        super(flavor, cost);
    }

    @Override
    String getMenuName() {
        return "FLAVORED CUP CAKES";
    }
}

class DrinksMenu extends Menu {
    DrinksMenu(String[] flavor, double[] cost) {
        super(flavor, cost);
    }

    @Override
    String getMenuName() {
        return "GLASS OF DRINKS";
    }
}

public class CafeMenu {
    public static void main(String[] args) {
        String[] cupcakeFlavor = {"CHOCOLATE", "RAISINS", "PINEAPPLE", "APPLE", "MANGO", "BANANA"};
        double[] cupcakeCost = {25.0, 50.0, 40.0, 30.0, 35.0, 45.0};
        CupcakeMenu cupcakeMenu = new CupcakeMenu(cupcakeFlavor, cupcakeCost);

        String[] drinksFlavor =
            {"SOFTDRINKS", "ICED TEA", "COFFEE", "APPLE JUICE", "MANGO JUICE", "PINEAPPLE JUICE"};
        double[] drinksCost = {25.0, 50.0, 40.0, 30.0, 35.0, 45.0};
        DrinksMenu drinksMenu = new DrinksMenu(drinksFlavor, drinksCost);

        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        int itemChoice;
        int quantity;

        while (true) {
            System.out.println("Select Menu: \n1. Cupcake Menu\n2. Drinks Menu\n3. Exit");
            menuChoice = scanner.nextInt();

            if (menuChoice == 3) {
                break;
            }

            if (menuChoice == 1) {
                cupcakeMenu.displayMenu();
            } else if (menuChoice == 2) {
                drinksMenu.displayMenu();
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("Enter your choice: ");
            itemChoice = scanner.nextInt();

            System.out.println("Enter quantity: ");
            quantity = scanner.nextInt();

            double cost = 0;
            if (menuChoice == 1) {
                cost = cupcakeMenu.getCost(itemChoice, quantity);
            } else if (menuChoice == 2) {
                cost = drinksMenu.getCost(itemChoice, quantity);
            }

            System.out.printf("Total cost: %.2f\n", cost);
        }
    }
}
