

public class Mnozenie {
    public static void main(String[] args) {
        Dzialanie tabliczkaMnozenia = new Dzialanie();
        tabliczkaMnozenia.pomnoz(2,4);
        tabliczkaMnozenia.pomnoz(5,7,3);
        tabliczkaMnozenia.pomnoz(2.6,6,2,5);
    }
}


class Dzialanie {                                           //klasa
    public void pomnoz(int a,int b) {                       //metoda
        System.out.println(a*b);

    }
    public void pomnoz(int a, int b, int c) {               //metoda
        System.out.println(a*b*c);
    }

    public void pomnoz(double a, int b, int c, int d) {      //metoda
        System.out.println(a*b*c*d);
    }
}