package MyAdditionalExercises.ProgramowanieObiektowe;

public class Auto {
    public String markaSamochodu;
    public String modelSamochodu;
    public Integer rokProdukcji;
    public Integer przebieg;

    public Auto(String markaSamochodu, String modelSamochodu, Integer rokProdukcji, Integer przebieg) {
        this.markaSamochodu = markaSamochodu;
        this.modelSamochodu = modelSamochodu;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }

    public void jedz() {
        System.out.println("Jedz");
        System.out.println();
    }

    public void hamuj(){
        System.out.println("Hamuj!");
        System.out.println();
    }

    public void info() {
        System.out.println("Marka: " + markaSamochodu);
        System.out.println("Model: " + modelSamochodu);
        System.out.println("Rok produkcji: " + rokProdukcji + "r");
        System.out.println("Przebieg: " + przebieg + "km");
        System.out.println();
    }

}
