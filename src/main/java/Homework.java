import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int number;

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe, ale pamietaj, ze 0 i 1 koncza skrypt: ");
        number = in.nextInt();
        while (number != 0 && number != 1) {
            if (number < 0)
                System.out.println("Liczba musi być dodatnia");
            else
                System.out.println(datacheck(number));
            System.out.print("Podaj kolejna liczbe, ale pamietaj, ze 0 i 1 koncza skrypt: ");
            number = in.nextInt();
        }
        System.exit(0);
    }

        private static String datacheck ( int number){
        int counter = 0;
        for (int i = 2; i <= number + 1; i++) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        if (counter > 1)
            return dataFalse();
        else
            return dataTrue();
    }
        private static String dataTrue () {
        return "Wybrana przez Ciebie liczba jest liczbą pierwszą";
    }
        private static String dataFalse () {
        return "Wybrana przez Ciebie liczba NIE jest liczbą pierwszą";
    }

}

//i nie wiem jak zrobic try catcha