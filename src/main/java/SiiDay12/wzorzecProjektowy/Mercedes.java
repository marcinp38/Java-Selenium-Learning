package SiiDay12.wzorzecProjektowy;

public class Mercedes implements ISamochod {
    int cena = 250000;
    int maxPredkosc = 195;
    String kolor = "granatowy";

    @Override
    public int maxPredkosc() {
        return maxPredkosc;
    }
}