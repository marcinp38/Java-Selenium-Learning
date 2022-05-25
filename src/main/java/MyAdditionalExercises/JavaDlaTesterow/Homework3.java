package MyAdditionalExercises.JavaDlaTesterow;
// wypisz liczby z zakresu 1-100 podzielne przez 3
// odwroc elementy tablicy [1,3,5] -> [5,3,1]

public class Homework3 {
    public static void main(String[] args) {
        int[] lista = new int[]{1, 3, 5};
        int loopLimit = 100;

        //Wypisywanie liczb
        for (int i = 0; i <=loopLimit; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //odwrocenie listy
        int listSize = lista.length;
        for (int i = listSize-1; i >=0 ; i--) {
            System.out.println(lista[i]);
        }
    }
}
