package MyAdditionalExercises.ProgramowanieObiektowe;

public class FirstStudent {
    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int nrIndeksu;
    public static String nazwaUczelni = "AGH";



    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " " + nazwisko);
    }

    public void zalogujSie() {
        System.out.println("Moj nick do logowania to " + nick);
    }

    public void podajNrIndeksu() {
        System.out.println("Moj nr indeksu to " + nrIndeksu);
    }

    public void podajEmail() {
        System.out.println("Moj adres email to " + email);
    }

    public static void infoUczelnia() {
        System.out.println("Moja uczelnia to Politechnika Krakowska");

    }


}
