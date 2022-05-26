package MyAdditionalExercises.ProgramowanieObiektowe;
// przygotowac kalkulator ktory poprosi o dwie liczby a nastepnie wykona na nich podstawowe operacje
//metody obliczania maja byc w osobnej klasie i zwracac typ int
import java.util.Scanner;

public class Homework2 {

        public static void main(String[] args) {
            Homework2Methods calculator = new Homework2Methods();

            System.out.println("Witaj w podstawowym kalkulatorze!");
            Scanner input = new Scanner(System.in);
            System.out.print("Podaj pierwsza liczbe: ");
            int numberOne = input.nextInt();
            System.out.print("Podaj druga liczbe: ");
            int numberTwo = input.nextInt();

            System.out.println("Wynik dodawania to: " + calculator.addition(numberOne, numberTwo));
            System.out.println("Wynik odejmowania to: " + calculator.subtraction(numberOne, numberTwo));
            System.out.println("Wynik mnozenia to: " + calculator.multiplication(numberOne, numberTwo));
            System.out.println("Wynik dzielenia to: " + calculator.division(numberOne, numberTwo));
            System.out.println("Wynik modulo to: " + calculator.modulo(numberOne, numberTwo));
        }
    }


