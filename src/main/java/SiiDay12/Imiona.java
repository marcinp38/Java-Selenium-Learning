package SiiDay12;

import java.util.Scanner;

public class Imiona {
    public static void main(String[] args) {
        String imie;
//        main - public.static.void main
//        sout - System.out.println

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj swoje imie: ");
        imie = in.nextLine();

        switch (imie){
            case("Gerwazy"):
                System.out.println("oo, miło mi, Gerwazy");
                break;
            case("Józek"):
                System.out.println("a witam, witam, Józek");
                break;
            case("Henryk"):
                System.out.println("cześć Heniu");
                break;
            default:
                System.out.println("Niestety Cię nie znam " + imie);
        }
    }
}
