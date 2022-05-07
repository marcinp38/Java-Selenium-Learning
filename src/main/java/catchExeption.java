import java.util.Scanner;

public class catchExeption {
    public static void main(String[] args) {
        int[] tab = {1, 3, 5, 12, 33};

        try {
            for (int i = 0; i <= tab.length; i++) {
                System.out.println(tab[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Zlapalismy wyjatek");
            System.out.println(e.getMessage());
        }
    }
}