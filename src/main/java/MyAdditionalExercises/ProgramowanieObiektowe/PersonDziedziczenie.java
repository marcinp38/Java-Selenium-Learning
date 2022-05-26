package MyAdditionalExercises.ProgramowanieObiektowe;

public class PersonDziedziczenie {
    public String name;
    public int age;

    public PersonDziedziczenie(String name, int age) {
        System.out.println("Jestem w konstruktorze PersonDziedziczenie");
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("I like pizza!");
    }

    public void walk() {
        System.out.println("I like walking!");
    }
}
