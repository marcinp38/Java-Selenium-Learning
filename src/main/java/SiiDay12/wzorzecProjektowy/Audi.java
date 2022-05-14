package SiiDay12.wzorzecProjektowy;

public class Audi implements ISamochod {
    int cena = 150000;
    int maxPredkosc = 200;
    String kolor = "srebrny";

    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}
