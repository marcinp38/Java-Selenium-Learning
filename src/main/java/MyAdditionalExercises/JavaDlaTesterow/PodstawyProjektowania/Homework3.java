package MyAdditionalExercises.JavaDlaTesterow.PodstawyProjektowania;
// wypisz liczby z zakresu 1-100 podzielne przez 3
// odwroc elementy tablicy [1,3,5] -> [5,3,1]

public class Homework3 {
    public static void main(String[] args) {
        int[] lista = new int[]{1, 3, 5,7,0};
        int loopLimit = 100;
        int listSize = lista.length;

        //Wypisywanie liczb
        System.out.print("Liczby podzielne przez 3 to: ");
        for (int i = 0; i <=loopLimit; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();



        //odwrocenie listy
        System.out.print("Odwrocone elementy tablicy [1,3,5,7,0] to: ");
        for (int i = 0; i < (listSize/2); i++) {
            int tmp = lista[i];                  //tymczasowy element w tablicy przechowujacy dla i=0 -> 1, i=1->3,
            lista[i] = lista[listSize - 1 - i]; //odwrocenie tablicy - ostani element wskakuje na pierwszy 4->0, 3->7
            lista[listSize - 1 - i] = tmp;     //1   lista[3]=3
            System.out.println("iteracja nr: " + i);
        }
        for (int i = 0; i < listSize; i++) {
            System.out.print(lista[i] + " ");
        }


    }
}
