package MyAdditionalExercises.youtube;

import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;

        boolean isNumberGuessed=false;

        while(!isNumberGuessed){
            System.out.print("Podaj liczbe: ");
            int userNumber = scanner.nextInt();

            if (userNumber < numberToGuess){
                System.out.println("Liczba jest za mała");
            } else if (userNumber>numberToGuess) {
                System.out.println("Liczba jest za duża");
            }
            else {
                System.out.println("Brawo, to właściwa liczba");
                isNumberGuessed=true;
            }
        }


    }
}
