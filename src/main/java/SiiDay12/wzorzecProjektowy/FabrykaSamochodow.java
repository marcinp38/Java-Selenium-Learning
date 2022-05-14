package SiiDay12.wzorzecProjektowy;

public class FabrykaSamochodow {
    public static ISamochod getSamochod(int predkosc) {
        ISamochod auto;
        if (predkosc<=190)
            auto = new Audi();
        else if (predkosc<=195)
            auto = new Mercedes();

        else
            auto = new BMW();
        return auto;

    }
}
