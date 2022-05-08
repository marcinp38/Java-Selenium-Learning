

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

        System.out.println(programistaMarcin.imie+" "+programistaMarcin.nazwisko+" lat: "+programistaMarcin.wiek);
        System.out.println(tester.wiek);

        programistaMarcin.wyswietlDane();
        tester.wyswietlDane();
    }
}
class Pracownik{
    String imie;
    String nazwisko;
    int wiek;

    public void  wyswietlDane(){
        System.out.println("Pracownik: "+imie+ " " +nazwisko+"\t"+wiek+"lat");
    }
    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public int getWiek(){
        return wiek;
    }
}
