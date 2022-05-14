package SiiDay12;

import java.util.Scanner;
public class Tablica {
    public static void main(String[] args) {

        String table[] = new String[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < table.length; i++) {
            System.out.print("give me " + (i + 1) + " name: ");
            table[i] = in.nextLine();
        }

        int k=0;
        while(k<5){
            System.out.println(table[k]);
            k++;
        }

    }
}