package MyAdditionalExercises.ProgramowanieObiektowe;

public class SecondAutoTest {
    public static void main(String[] args) {
/*      Deklaracja zmiennej typu FirstAuto

        FirstAuto - klasa do ktorej sie odwolujemy - typ zmiennej
        mercedes - nazwa zmiennej - dowolna
        new FirstAuto() - obiekt klasy FirstAuto - nowy obiekt
 */
        FirstAuto mercedes = new FirstAuto();       //Nowy obiekt klasy FirstAuto przypisany do zmiennej 'mercedes'
        mercedes.markaSamochodu = "Mercedes";      //przypisywanie wartosci do pol obiektu
        mercedes.modelSamochodu = "Klasa S";        //oznaczenie po kropce f - field - pole klasy - zmienna
        mercedes.rokProdukcji = 2021;
        mercedes.przebieg = 1000;

//        Wywolywanie metod wewnatrz klasy FirstAuto
        mercedes.jedz();        //oznaczenie po kropce m - method - metoda
        mercedes.hamuj();       //przytrzymanie CTRL i klikniecie na wywolanie metody przenosi nas do wskazanej metody
        mercedes.info();

        FirstAuto audi = new FirstAuto();
        audi.markaSamochodu = "Audi";
        audi.modelSamochodu = "A5";
        audi.rokProdukcji = 2020;
        audi.przebieg = 10;

        audi.jedz();
        audi.hamuj();
        audi.info();

        FirstAuto kia = new FirstAuto();
        kia.jedz();
        kia.hamuj();
        kia.info();



    }
}
