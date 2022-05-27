package MyAdditionalExercises.ProgramowanieObiektowe.Homework4Drivers;

public class Homework4ChromeDriver implements Homework4WebDriver {


    @Override
    public void get() {
        System.out.println("Otwieramy przegladarke Chrome");
    }

    @Override
    public void findElementBy() {
        System.out.println("Znajdujemy element za pomoca przegladarki Chrome");
    }

}
