package MyAdditionalExercises.ProgramowanieObiektowe;

public class UserConstructors {
    public String username;
    public String password;


    public UserConstructors(String username, String password) {
        System.out.println("Hello z Konstruktora");
        this.username = username;
        this.password = password;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + username);
        System.out.println("And my password is " + password);
    }
}
