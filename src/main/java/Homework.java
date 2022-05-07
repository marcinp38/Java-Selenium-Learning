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

    //  Nie do konca rozumiem dlaczego to dziala, ale dziala xD
//  tzn nie rozumiem tylko tych dwoch returnow, czemu chcialo ode mnie 2, a nie chcialo else
//    No i widzialem ze Dorota (szac za czystosc kodu) i Marek zrobili to duzo lepiej
//    ale ja chcialem zostawic swoje wypociny
    private static String datacheck(int number) {
        if (number % 7 != 0 || number % 5 != 0 || number % 3 != 0 || number % 2 != 0)
            if (number == 1 || number == 2 || number == 3 || number == 5 || number == 7)
                return dataTrue();
        return dataFalse();
    }

    private static String dataTrue() {
        return "Wybrana przez Ciebie liczba jest liczbą pierwszą";
    }

    private static String dataFalse() {
        return "Wybrana przez Ciebie liczba NIE jest liczbą pierwszą";
    }
}

//i nie wiem jak zrobic try catcha