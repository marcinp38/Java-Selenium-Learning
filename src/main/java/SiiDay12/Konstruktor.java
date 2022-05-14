package SiiDay12;

public class Konstruktor {
    public static void main(String[] args) {

        Samochod auto1 = new Samochod();
        auto1.kolor = "czerwony";
        auto1.marka = "Skoda";
        auto1.rokProdukcji = 1984;

        SamochodNowy auto = new SamochodNowy("czerwony", "skoda", 1984);
        SamochodNowy auto2 = new SamochodNowy("bialy", "ford", 1700);
    }
}



class Samochod {
    int rokProdukcji;
    String marka;
    String kolor;
}
class SamochodNowy {
    int rokProdukcji;
    String marka;
    String kolor;

    public SamochodNowy(String kolor, String marka, int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
        this.kolor = kolor;
        this.marka = marka;
    }
}

