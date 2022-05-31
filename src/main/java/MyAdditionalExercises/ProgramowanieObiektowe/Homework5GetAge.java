package MyAdditionalExercises.ProgramowanieObiektowe;

import java.util.Scanner;
//pobierz wiek od uzytkownika, jezeli bedzie mniejszy od 0 to wyrzuc wyjatek InvalidAgeException
// jezeli mamy 18>= to mozemy wypisac ze jestes pelnoletni
public class Homework5GetAge {
    public static void main(String[] args) throws Homework5GetAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your age ?");
        int age = scanner.nextInt();
        if (age >=18) {
            System.out.println("You're " + age + " years old and you're adult");
        } else if (age>0) {
            System.out.println("You're " + age + " years old");
        } else
            throw new Homework5GetAgeException("The age is not above 0!");



    }
}
