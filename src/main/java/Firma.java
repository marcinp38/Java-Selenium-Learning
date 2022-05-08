

public class Firma {
    public static void main(String[] args) {

        Pracownik programistaMarcin;
        Pracownik tester;

        programistaMarcin = new Pracownik();
        tester = new Pracownik();

        programistaMarcin.imie = "Marcin";
        programistaMarcin.nazwisko = "Petynia";
        programistaMarcin.wiek = 33;

        tester.imie = "Wiola";
        tester.nazwisko = "Nowak";
        tester.wiek = 26;

        System.out.println(programistaMarcin.imie+ " " + programistaMarcin.nazwisko);
        System.out.println(tester.wiek);
    }
}
class Pracownik{
    String imie;
    String nazwisko;
    int wiek;
}
