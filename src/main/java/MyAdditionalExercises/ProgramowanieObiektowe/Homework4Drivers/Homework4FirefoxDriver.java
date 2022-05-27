package MyAdditionalExercises.ProgramowanieObiektowe.Homework4Drivers;

public class Homework4FirefoxDriver implements Homework4WebDriver {

    @Override
    public void get() {
        System.out.println("Otwieramy przegladarke Firefox");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoca przegladarki Firefox");
    }

}
