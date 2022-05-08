

public class Firma {
    public static void main(String[] args) {

        Pracownik programistaMarcin;
        Pracownik tester;

        programistaMarcin = new Pracownik();
        tester = new Pracownik();

        programistaMarcin.imie = "Marcin";
        programistaMarcin.nazwisko = "Petynia";
        programistaMarcin.wiek = 33;

        tester.setImie("Wiola");
        tester.setNazwisko("Nowak");
        tester.setWiek(26);

        System.out.println(programistaMarcin.imie+" "+programistaMarcin.nazwisko+" lat: "+programistaMarcin.wiek);
        System.out.println(tester.wiek);

        programistaMarcin.wyswietlDane();   //ex2
        tester.wyswietlDane();              //ex2

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

    public void setImie(String imie) {    //alt+insert setter
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;

    }



}
