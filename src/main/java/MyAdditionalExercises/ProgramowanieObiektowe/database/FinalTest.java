package MyAdditionalExercises.ProgramowanieObiektowe.database;

import MyAdditionalExercises.ProgramowanieObiektowe.PersonDziedziczenie;

public class FinalTest {
    public static void main(String[] args) {
        final int x = 21;

        final PersonDziedziczenie person = new PersonDziedziczenie("Mick", 30);
        person.age = 25;

    }
}
