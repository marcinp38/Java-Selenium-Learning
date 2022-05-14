package SiiDay12;

import java.util.Scanner;

public class Porownanie {
    public static void main(String[] args) {
        int a;
        int b;
        //main - public.static.void main
        //sout - System.out.println

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj a: ");
        a = in.nextInt();
        System.out.print("Podaj b: ");
        b = in.nextInt();
        if (a<b)
            System.out.println("a mniejsze od b");
        else if (a>b)
            System.out.println("a wieksze od b");
        else
            System.out.println("a rowne b");


    }
}


