package MyAdditionalExercises.ProgramowanieObiektowe;
//stworz klase bazowa APP - zawiera pole name i metode appInfo, dodaj konstruktor do ktorego przypiszesz wartosc name
//stworz klasy potomne AndroidApp i IphoneApp - zawiera metode runAndroidApp/ runIphoneApp
public class Homework3AppChecker {
    public static void main(String[] args) {
        Homework3AndroidApp android = new Homework3AndroidApp("Android");
        android.runAndroidApp();
        android.appInfo();

        Homework3IphoneApp iphone = new Homework3IphoneApp("Iphone");
        iphone.runIphoneApp();
        iphone.appInfo();
    }
}
