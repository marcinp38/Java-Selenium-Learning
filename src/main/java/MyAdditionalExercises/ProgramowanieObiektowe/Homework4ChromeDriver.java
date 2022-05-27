package MyAdditionalExercises.ProgramowanieObiektowe;

public class Homework4ChromeDriver implements WebDriver{


    @Override
    public void get(String typ) {
        System.out.println("Otwieramy przegladarke za pomoca " + typ);
    }

    @Override
    public void findElementBy(String przegladarka) {
        System.out.println("Znajdujemy element za pomoca przegladarki " + przegladarka);
    }

}
