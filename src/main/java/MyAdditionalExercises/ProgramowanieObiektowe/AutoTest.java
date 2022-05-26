package MyAdditionalExercises.ProgramowanieObiektowe;

public class AutoTest {
    public static void main(String[] args) {

        Auto mercedes = new Auto("Mercedes","Klasa S", 2021,1000);
        Auto audi = new Auto("Audi", "A5", 2020, 10);
        Auto kia = new Auto("Kia", "Proceed", 2020, 15000);

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        audi.info();

        kia.info();



    }
}
