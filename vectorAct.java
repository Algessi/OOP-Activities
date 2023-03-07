// Althea Janine Duran | BSCS-2B
import java.util.Vector;

public class vectorAct {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>(5);
        vector.add(20);
        vector.add(25);
        vector.add(75);
        vector.add(30);
        vector.add(100);
        
        // Display the vector
        System.out.print("Vector: ");
        for (int i = 0; i < vector.size(); i++) {
            int num = vector.get(i);
            System.out.print(num + " ");
        }
    }
}



