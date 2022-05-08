public class Uczniowie {
    public static void main(String[] args) {
        Student michal = new Student("Michal", "Piorkowski",4.7,180,"846219");
        michal.imie = "Michal";
        michal.nazwisko = "Piorkowski";
        michal.srednia = 4.7;
        michal.wynikMatury = 180;
        michal.numerIndeksu = "846219";

        Licealista pawel = new Licealista("Pawel","Kowalski",3.25,143);
        pawel.imie = "Pawel";
        pawel.nazwisko = "Kowalski";
        pawel.srednia = 3.25;
        pawel.wynikMatury = 143;
    }
}
class Uczen {
    String imie;
    String nazwisko;

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
class Podstawowkarz extends Uczen {
    double srednia;


    public Podstawowkarz(String imie, String nazwisko, double srednia) {
        super(imie, nazwisko);
        this.srednia = srednia;
    }
}                                                       //alt+insert - konstruktor
class Licealista extends Podstawowkarz {              //alt+Enter - podpowiedzi
    int wynikMatury;

    public Licealista(String imie, String nazwisko, double srednia, int wynikMatury) {
        super(imie, nazwisko, srednia);
        this.wynikMatury = wynikMatury;
    }
}
class Student extends Licealista {
    String numerIndeksu;

    public Student(String imie, String nazwisko, double srednia, int wynikMatury, String numerIndeksu) {
        super(imie, nazwisko, srednia, wynikMatury);
        this.numerIndeksu = numerIndeksu;
    }
}