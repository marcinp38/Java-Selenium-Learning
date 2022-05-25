package MyAdditionalExercises.JavaDlaTesterow;

import java.util.Scanner;

public class TheoryPart3 {
    public static void main(String[] args) {

//    Instrukcje warunkowe - pozwalaja okreslic ktore czesci kodu maja byc wykonane, gdy spelnimy warunek

//        Instrukcja warunkowa "IF" + "ELSE"
        float dzielna = 4.0F;
        float dzielnik = 2.0F;

        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna / dzielnik);
        } else {
            System.out.println("Nie dziel przez 0, cholero!");
        }
        System.out.println();
//        Instrukcja warunkowa "IF-ELSE" - w przeciwnym wypadku
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int number= input.nextInt();
        if (number == 0) {
            System.out.println("Liczba jest rowna 0");
        } else if (number>0) {
            System.out.println("Liczba wieksza od 0");
        } else if (number < 0) {
            System.out.println("Liczba mniejsza od 0");
        } else {
            System.out.println("Nie podales poprawnej liczby");
        }


    }
}
