package MyAdditionalExercises.JavaDlaTesterow;

public class TheoryPart4 {
    public static void main(String[] args) {


        //    Tablice jednowymiarowe
        String[] imiona = new String[3];        //pierwszy sposob deklaracji - podajemy wielkosc tablicy

        imiona[0] = "Marcin";                   //inicjalizujemy dane do tablicy - idziemy pozycja po pozycji
        imiona[1] = "Wiola";
        imiona[2] = "Stas";

        System.out.print(imiona[2] + " ");          //PAMIETAC ze numerujemy od 0!!!
        System.out.print(imiona[1] + " ");
        System.out.println();

        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};   //drugi sposob deklaracji - od razu w wasach wpisujemy
        System.out.print(lottoNumbers[5] + " ");            //wartosci przypisane do pozycji w tabeli
        System.out.print(lottoNumbers[2] + " ");
        System.out.print(lottoNumbers[0] + " ");
        System.out.println(lottoNumbers.length);

        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.println(lottoNumbers[i]);

        }

    }

}
