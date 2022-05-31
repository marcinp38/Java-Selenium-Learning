package MyAdditionalExercises.ProgramowanieObiektowe.Homework4Drivers;

public class WebDriverSecondTest {

    public static void main(String[] args) {

        Homework4WebDriver chrome = new Homework4ChromeDriver();
        Homework4WebDriver secondChrome = new Homework4ChromeDriver();

        Homework4WebDriver firefox = new Homework4FirefoxDriver();
        Homework4WebDriver secondFirefox = new Homework4FirefoxDriver();
        Homework4WebDriver thirdFirefox = new Homework4FirefoxDriver();


        Homework4WebDriver safari = new Homework4WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening page with Safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with Safari");
            }
        };

        safari.get();
        safari.findElementBy();

    }
}
