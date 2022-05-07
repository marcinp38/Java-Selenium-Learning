import java.util.Scanner;
public class Homework {
    public static void main(String[] args) {
        int number;
//        String haslo;
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        number = in.nextInt();
//        Scanner inp = new Scanner(System.in);
//        System.out.print("Wpisz 'exit' jesli chcesz wyjsc: ");
//        haslo = inp.nextLine();
//        while (haslo.equals("exit")) break;
        System.out.println(datacheck(number));
            }

//    private static String loop(int number) {
//        String haslo;
//        Scanner in = new Scanner(System.in);
//        System.out.print("Wpisz 'exit' jesli chcesz wyjsc: ");
//        haslo = in.nextLine();
//        if (haslo.equals("exit"))
//            return
//                System.out.print("Program przestał działać");
//        else
//        Scanner in = new Scanner(System.in);
//        System.out.print("Podaj liczbe: ");
//        number = in.nextInt();
//        return
//                System.out.println(datacheck());
//    }
//  Nie do konca rozumiem dlaczego to dziala, ale dziala xD
//  tzn nie rozumiem tylko tych dwoch returnow, czemu chcialo ode mnie 2, a nie chcialo else
    private static String datacheck(int number) {
        if (number % 7 != 0 || number%5!=0 || number%3!=0 || number%2!=0)
            if(number==1 || number==2 || number==3 || number ==5 || number==7)
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

