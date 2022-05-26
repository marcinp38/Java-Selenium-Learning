package MyAdditionalExercises.JavaDlaTesterow.PodstawyProjektowania;

import java.util.Scanner;

public class TheoryPart3 {
    public static void main(String[] args) {

//    Instrukcje warunkowe - pozwalaja okreslic ktore czesci kodu maja byc wykonane, gdy spelnimy warunek

//        Instrukcja warunkowa "IF" + "ELSE"
        float dzielna = 4.0F;
        float dzielnik = 2.0F;

        if (dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna / dzielnik);
        } else {
            System.out.println("Nie dziel przez 0, cholero!");
        }
        System.out.println();

//        Instrukcja warunkowa "IF-ELSE" - w przeciwnym wypadku
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int number= input.nextInt();
        if (number == 0) {
            System.out.println("Liczba jest rowna 0");
        } else if (number>0) {
            System.out.println("Liczba wieksza od 0");
        } else if (number < 0) {
            System.out.println("Liczba mniejsza od 0");
        } else {
            System.out.println("Nie podales poprawnej liczby");
        }
        System.out.println();

//        Instrukcja Switch - przeskakiwanie po opcjach
        String danie = "Pizza";                                 //mozna tu uzyc scannera ale przy wypisaniu recznym
        switch (danie) {                                        //to wezmie pod uwage tylko case "Pizza"
            case "Pizza":                                       // break; jest po to zeby nie przeskoczyl do
                System.out.println("Pizza kosztuje 22 zl");     //kolejnego case'a, tylko zakonczyl petle
                break;
            case "Losos":
                System.out.println("Losos kosztuje 25zl");
                break;
            case "Burger":
                System.out.println("Burger kosztuje 19zl");
                break;
            default:                                            //default jest takim "else" - w przypadku jak nie
                System.out.println("Nie ma takiego dania w karcie");    //podamy zadnej z powyzszych opcji
        }
        System.out.println();

//        Petla "FOR" i "FOR EACH" - przejscie po okreslonej ilosci razy
        int loopLimit = 100;
        for (int i = 0; i <= loopLimit; i+=2) {        //wypisanie wszystkich elementow przeskakujacych o 2, od 0 do 100
            System.out.println(i);
        }
        System.out.println();

//        Petla while - wykonuje sie dopoki warunek jest rowny 'true'
        int loopNumber =2;
        while (loopNumber<20) {                     //w nawiasach wstawiamy jedynie warunek
            System.out.println("Moja wartosc to: " + loopNumber + " i jest mniejsza od 20");
            loopNumber++;                           //tu inkrementacje dodajemy juz w samej petli
        }
        System.out.println();

//        Petla 'Do-while' - w przeciwienstwie do petli 'while' ta petla ZAWSZE wykona przynajmniej jedno przejscie
        do {
            System.out.println("Jestem przy: " + loopNumber + " i zmierzam do 20");
            loopNumber++;
        } while (loopNumber<20);



    }
}
