package MyAdditionalExercises.JavaDlaTesterow;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Witaj w sklepie monopolowym!");
        System.out.print("Ile masz lat? ");
        int getAge = input.nextInt();
        if (getAge<=0){
            System.out.println("Nie klam! Podaj prawdziwy wiek!");
        } else if (getAge < 18) {
            System.out.println("Przykro mi, nie mozesz kupic alkoholu");
        } else {
            System.out.println("Smialo, wybieraj co chcesz");
        }


    }
}
