package MyAdditionalExercises.ProgramowanieObiektowe;

public class Homework4InterfaceChecker {
    public static void main(String[] args) {
        Homework4ChromeDriver homework4ChromeDriver = new Homework4ChromeDriver();
        homework4ChromeDriver.get("Chrome");
        homework4ChromeDriver.findElementBy("ChromE");

        Homework4FirefoxDriver homework4FirefoxDriver = new Homework4FirefoxDriver();
        homework4FirefoxDriver.get("Firefox");
        homework4FirefoxDriver.findElementBy("FireFox");


    }
}
