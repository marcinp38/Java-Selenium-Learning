package SiiDay34;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        MovieLibrary lib = new MovieLibrary();
        Director polanski = new Director("Roman", "Polanski");
        Director allen = new Director("Woody", "Allen");
        Director pasik = new Director("Wladyslaw", "Pasikowski");
        Director besson = new Director("Luc","Besson");

        Actor act1 = new Actor("Jean", "Reno");
        Actor act2 = new Actor("Luis", "de Funes");
        Actor act3 = new Actor("Brad", "Pitt");
        Actor act4 = new Actor("Angelina", "Jolie");
        Actor act5 = new Actor("Izabella", "Scorupco");

        Movie goldenEye = new Movie("Golden Eye", 1995, pasik, Genere.THRILLER);
        goldenEye.addActor(act5);
        goldenEye.addActor(act1);
        goldenEye.addActor(act2);

        Movie graniceWytrzymalosci = new Movie("Granice wytrzymalosci", 1989, allen, Genere.KOMEDIA);
        graniceWytrzymalosci.addActor(act5);
        graniceWytrzymalosci.addActor(act4);
        graniceWytrzymalosci.addActor(act3);

        Movie OgniemIMieczem = new Movie("Ogniem i Mieczem", 1999, polanski, List.of(act3, act5, act4), Genere.DRAMAT);

        Movie naNoze = new Movie("Na noze", 2021, pasik, List.of(act3, act2, act4, act5, act1), Genere.THRILLER);

        Movie wielkiBlekit = new Movie("Wielki Blekit", 1989, besson, List.of(act1, act4, act3), Genere.DRAMAT);

        lib.add(goldenEye);
        lib.add(graniceWytrzymalosci);
        lib.add(OgniemIMieczem);
        lib.add(naNoze);
        lib.add(wielkiBlekit);



        Scanner input = new Scanner(System.in);
        boolean isExit = false;
        String inputCommand;

        System.out.println("Komendy: \n" +
        "e - wyjscie \n"+
        "d - szukaj wg daty \n"+
        "r - wybierz losowy film\n"+
        "a - szukaj wg aktora");


        while(!isExit){
            System.out.print("Podaj komende: ");
            inputCommand = input.nextLine();
            switch (inputCommand) {
                case "e": isExit = true;
                break;
                case "d":
                    System.out.println("Podaj date poczatkowa: ");
                    int start = Integer.parseInt(input.nextLine());
                    System.out.println("Podaj date koncowa: ");
                    int end = Integer.parseInt(input.nextLine());
                    lib.showMoviesBetweenDates(start,end);
                    break;
                case "r":
                    lib.showRandomMovieDetails();
                    break;
                case "a":
                    System.out.println("Podaj imie: ");
                    String imie = input.nextLine();
                    System.out.println("Podaj nazwiko: ");
                    String nazwisko = input.nextLine();
                    lib.showMoviesWithActor(imie, nazwisko);
                    break;
            }

        }

    }
}
