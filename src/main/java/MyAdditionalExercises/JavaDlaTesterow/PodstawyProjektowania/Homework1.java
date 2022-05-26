package MyAdditionalExercises.JavaDlaTesterow.PodstawyProjektowania;
//Homework - topic: Stworz prosty kalkulator wypisujacy wynik dodawania, odejmowania, mnozenia, dzielenia i modulo
//dwoch liczb
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        System.out.println("Witaj w podstawowym kalkulatorze!");
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj pierwsza liczbe: ");
        double numberOne = input.nextInt();
        System.out.print("Podaj druga liczbe: ");
        double numberTwo = input.nextDouble();

        double addition = numberOne + numberTwo;
        double subtraction = numberOne - numberTwo;
        double multiplicaton = numberOne * numberTwo;
        double division = numberOne / numberTwo;
        double mod = numberOne % numberTwo;

        System.out.println("Wynik dodawania to: "+ addition);
        System.out.println("Wynik odejmowania to: "+ subtraction);
        System.out.println("Wynik mnozenia to: "+ multiplicaton);
        System.out.println("Wynik dzielenia to: "+ division);
        System.out.println("Wynik modulo to: "+ mod);
    }
}
