import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe: ") ;
        System.out.println();
        number = in.nextInt();
        System.out.println(datacheck(number));
    }
//  Nie do konca rozumiem dlaczego to dziala, ale dziala xD
//  tzn nie rozumiem tylko tych dwoch returnow, czemu chcialo ode mnie 2, a nie chcialo else
    private static String datacheck(int number) {
        if (number % 7 != 0)
            if (number%5!=0)
                 if (number%3!=0)
                    if (number%2!=0)

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

