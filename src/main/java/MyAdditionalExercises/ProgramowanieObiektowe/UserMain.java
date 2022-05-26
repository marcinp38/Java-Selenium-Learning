package MyAdditionalExercises.ProgramowanieObiektowe;

public class UserMain {
    public static void main(String[] args) {

//        UserConstructors user = new UserConstructors();
        UserConstructors user2 = new UserConstructors("Milosz", "qazwsx123");
        System.out.println(user2.username);
        System.out.println(user2.password);
        System.out.println();
        user2.sayHello();
//        user.username = "Marcin";
//        user.password = "Qwert123";
//        user.sayHello();
    }
}