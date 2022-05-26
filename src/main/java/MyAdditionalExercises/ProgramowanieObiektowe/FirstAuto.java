package MyAdditionalExercises.ProgramowanieObiektowe;

public class FirstAuto {


/*      KLASA - Pewnego rodzaju szablon wg ktorego mozna tworzyc projekty
        - moze zawierac w sobie pola (zmienne) - np. private int rokProdukcji, public String markaSamochodu,...
        - moze zawierac w sobie metody - np. public void jedz(){}
              public - modyfikator dostepu
                void - czy klasa zwraca wartosc czy nie
                jedz - nazwa metody
                () - argumenty metody
                {} - cialo meotdy - tu podajemy instrukcje do wykonania
        - nie musi zawierac zadnych metod
*/

/*      OBIEKT - Przedstawiciel danej klasy
        - dzieki obiektom bedziemy w stanie wywolywac metody z klasy w ktorej nie ma klasy specjalnej 'main'

*/

//        przykladowa klasa z metodami
    public String markaSamochodu;
    public String modelSamochodu;
    public Integer rokProdukcji;
    public Integer przebieg;

    public void jedz() {
        System.out.println("Jedz");
        System.out.println();
    }

    public void hamuj(){
        System.out.println("Hamuj!");
        System.out.println();
    }

    public void info() {
        System.out.println("Marka: " +markaSamochodu);
        System.out.println("Model: " +modelSamochodu);
        System.out.println("Rok produkcji: " +rokProdukcji);
        System.out.println("Przebieg: " +przebieg);
        System.out.println();
    }


}
