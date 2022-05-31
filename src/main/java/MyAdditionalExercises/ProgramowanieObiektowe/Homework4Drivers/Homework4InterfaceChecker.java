package MyAdditionalExercises.ProgramowanieObiektowe.Homework4Drivers;

public class Homework4InterfaceChecker {
    public static void main(String[] args){

        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i < driverTypes.length; i++) {
            System.out.println(driverTypes[i].name);
            System.out.println(driverTypes[i].path);
        }

        Homework4WebDriver driver = getDriver(DriverType.CHROME);
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();


//        Homework4WebDriver driver1 = new Homework4FirefoxDriver();
//        driver1.get("Firefox");
//        driver1.findElementBy("FireFox");
//        driver1.findElementBy("FireFox");
//        driver1.findElementBy("FireFox");
//        driver1.findElementBy("FireFox");

//        Homework4ChromeDriver homework4ChromeDriver = new Homework4ChromeDriver();
//        homework4ChromeDriver.get("Chrome");
//        homework4ChromeDriver.findElementBy("Chrom");
//
//        Homework4FirefoxDriver homework4FirefoxDriver = new Homework4FirefoxDriver();
//        homework4FirefoxDriver.get("Firefox");
//        homework4FirefoxDriver.findElementBy("FireFox");

        }

    private static Homework4WebDriver getDriver(DriverType type) {
        if (type.name.equals("chrome")) {
            System.out.println(type.path);
            return new Homework4ChromeDriver();
        }
            System.out.println(type.path);
            return new Homework4FirefoxDriver();

    }

}
