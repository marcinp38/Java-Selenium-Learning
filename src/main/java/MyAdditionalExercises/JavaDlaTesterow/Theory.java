package MyAdditionalExercises.JavaDlaTesterow;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Theory {
    public static void main(String[] args) {

//          Typy danych proste
        int wiek = 33;
        System.out.println(wiek);

//          Typy danych obiektowe - można manipulować
        Integer wiek1=33;
        float wiek1u = wiek1.floatValue();
        System.out.println(wiek1u);

//          Zmienne - zarezerwowane miejsce z okreslonym typem danych
        String name1;               //nie ma obowiązku żeby przypisywać wartość - deklaracja
        String name = "Marcin";     //ale można to zrobić - "Marcin" to inicjalizacja zmiennej
        System.out.println(name);
        int firstNumber = 5;        //camelCase = jesli deklarujemy zmienna skladajaca sie z 2 wyrazow
        int secondNumber = 10;      // pierwszy z nich zapisujemy z malej litery a drugi z duzej
        double thirdNumber = 20;



        name = "Wiola";             //mozemy "nadpisywac" nasza zmienna
        System.out.println(name);


//          Operatory matematyczne - umozliwiaja wykonanie podstawowych operacji matematycznych
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        double division = thirdNumber / secondNumber;
        int mod = firstNumber % secondNumber;
        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania: " + subtraction);
        System.out.println("Wynik mnozenia: " + multiplication);
        System.out.println("Wynik dzielenia: " + division);
        System.out.println("Wynik modulo: " + mod);

        firstNumber+=secondNumber;      //taki zapis oznacza firstNumber = firstNumber + secondNumber
        System.out.println(firstNumber);//i mozemy tego uzywac do wszystkich opcji powyzej(=,-,*,/,%)

//        Inkrementacja i Dekrementacja
        int a = 0;
        System.out.println("Wartość a: " + a);
        int b = a++;                            //postinkrementacja - najpierw przypisuje wartosc do
        System.out.println("Wartość b: " + b);  //zmiennej a potem inkrementuje "a"
        System.out.println("Wartość a: " + a);
        int c = ++a;                            //preinkrementacja - najpierw inkrementuje "a"
        System.out.println("Wartość c: " + c);  //a potem przypisuje do nniego nowa wartosc
        System.out.println("Wartość a: " + a);
                                                //Dekrementacja dziala tak samo tylko z odejmnowaniem

//        Pobieranie danych od uzytkownika
        Scanner scanner = new Scanner(System.in);   //Scanner to metoda do pobeirania danych od usera
        System.out.print("Podaj imie: ");       //...print nie przenosi do nowej linii jak println
        String newName = scanner.nextLine();    // tylko zostaje w tej samej!
        System.out.println("cześć " + newName + "!");
        System.out.print("Podaj swoj wiek: ");
        int age = scanner.nextInt();
        System.out.println("Twoj wiek do kwadratu to: " + (age * age) + "!");

    }
}

