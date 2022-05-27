package MyAdditionalExercises.ProgramowanieObiektowe;

public class Footballer extends PersonDziedziczenie {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Footballer");
        this.footballClub = footballClub;
    }

    public void eat() {
        System.out.println("I like healthy food");
    }
    public void playFootball() {
        System.out.println("I'm playing football for " + footballClub);
    }




}
