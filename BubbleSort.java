//Althea Janine Duran | BSCS-2B
public class BubbleSort {
    public static void main(String[] args) {
        char[] ch = {'D', 'Z', 'H', 'Y', 'X', 'V', 'W'};

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - i - 1; j++) {
                if (ch[j] > ch[j + 1]) {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (char c : ch) {
            System.out.print(c + " ");
        }
    }
}
