package MyAdditionalExercises.ProgramowanieObiektowe;

import MyAdditionalExercises.ProgramowanieObiektowe.Homework4Drivers.Homework4FirefoxDriver;
import MyAdditionalExercises.ProgramowanieObiektowe.Homework4Drivers.Homework4WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConversionCasting {
    public static void main(String[] args) {


        int a = 2;
        double b = 4.34;

        double c = a / b;

        int d = a / (int) b;

        System.out.println(c);
        System.out.println(d);

        Homework4WebDriver driver = new Homework4FirefoxDriver();

        Homework4FirefoxDriver firefoxDriver = (Homework4FirefoxDriver) driver;
        firefoxDriver.get();
    }
}