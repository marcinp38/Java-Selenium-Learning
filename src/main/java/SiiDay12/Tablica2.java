package SiiDay12;

import java.util.Scanner;

public class Tablica2 {
    public static void main(String[] args) {
        String[] tablica = new String[5]; //indeksy 0-4
        Scanner in = new Scanner(System.in);

        System.out.print("Podaj rozmiar tablicy: ");
        int n = in.nextInt();
        int[] tab = new int[n];
        for (int k = 0; k<n; k++) {
            tab[k] = k+1;
            System.out.println(tab[k]);
        }
    }
}