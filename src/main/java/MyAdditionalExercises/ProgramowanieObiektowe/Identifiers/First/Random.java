package MyAdditionalExercises.ProgramowanieObiektowe.Identifiers.First;

public class Random {
    public void testIdentifier() {
        Parent parent = new Parent();
        System.out.println(parent.first);
        System.out.println(parent.second);
        System.out.println(parent.third);

        parent.firstMethod();
        parent.secondMethod();
        parent.thirdMethod();

    }
}
