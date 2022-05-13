package MyAdditionalExercises.youtube.Partyy;

import java.util.Scanner;

public class Impreza {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Party guests = new Party();

        while (shouldContinue){
            System.out.println("Wybierz opcję: ");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdz po numerze telefonu");
            System.out.println("5. Wyjście ");

            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1: {
                    guests.displayGuests();
                    break;
                }
                case 2: {
                    guests.addGuests();
                    break;
                }
                case 3: {
                    guests.displayMeals();
                    break;
                }
                case 4: {
                    guests.displayGuestByPhoneNumber();
                    break;
                }
                case 5:
                    shouldContinue = false;
                    break;
                default: {
                    System.out.println("Wybrales numer spoza zakresu");
                }
                    break;
            }



        }
    }
}
