import java.util.Scanner;

public class Jablka {
    public static void main(String[] args) {
        String owoc;
        int ilosc;

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj nazwe owoca: ");
        owoc = in.nextLine();


        if (owoc.equals("jabłka") || owoc.equals("banany") || owoc.equals("pomarańcze")) {
            System.out.print("Podaj ilosc owoca o nazwie " + owoc + ": ");
            ilosc = in.nextInt();
            if (ilosc > 100)
                System.out.println("owocu o nazwie " + owoc + " jest za duzo o " + (ilosc - 100) + "kg");
            else
                System.out.println("owocu o nazwie " + owoc + " jest w sam raz, mamy jeszcze " + (100 - ilosc) + " kg miejsca");
        }
            else
            System.out.println("Nie ma takich owoców w hurtowni");
    }
}

