package SiiDay12.warzywniak;

public abstract class Owoc implements  iOwoce{
    int cena;
    int waga;
    String kolor;

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }
}
