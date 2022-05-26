package MyAdditionalExercises.ProgramowanieObiektowe;

public class Homework1Students {

//        Stworz 3 obiekty klasy student.
//        Przypisz wartosci do pol.
//        Stworz tablice i dodaj studentow do tablicy.
public static void main(String[] args) {

    String uczelnia = FirstStudent.nazwaUczelni;
    FirstStudent.infoUczelnia();

    FirstStudent student1 = new FirstStudent();
    student1.imie = "Marcin";
    student1.nazwisko = "Petynia";
    student1.nick = "marcinek";
    student1.email = "marcintester@op.pl";
    student1.nrIndeksu = 183381;
    String uczelniaMarcina = student1.nazwaUczelni;


    student1.przedstawSie();
    student1.zalogujSie();
    student1.podajEmail();
    student1.podajNrIndeksu();
    student1.infoUczelnia();
    System.out.println();

    FirstStudent student2 = new FirstStudent();
    student2.imie = "Wiola";
    student2.nazwisko = "Chodacka";
    student2.nick = "Wiolcyna";
    student2.email = "wiola@gmail.com";
    student2.nrIndeksu = 109901;

    student2.przedstawSie();
    student2.zalogujSie();
    student2.podajEmail();
    student2.podajNrIndeksu();
    System.out.println();

    FirstStudent student3 = new FirstStudent();
    student3.imie = "Stas";
    student3.nazwisko = "Tarkowski";
    student3.nick = "Tasio";
    student3.email = "stan@gmail.com";
    student3.nrIndeksu = 922921;

    student3.przedstawSie();
    student3.zalogujSie();
    student3.podajEmail();
    student3.podajNrIndeksu();
    System.out.println();

    FirstStudent[] listaStudentow = new FirstStudent[3];
    listaStudentow[0] = student1;
    listaStudentow[1] = student2;
    listaStudentow[2] = student3;


    for (int i = 0; i < listaStudentow.length; i++) {
        listaStudentow[i].przedstawSie();
        listaStudentow[i].podajNrIndeksu();
        System.out.println();

    }
    System.out.println();






    }

}

