package MyAdditionalExercises.ProgramowanieObiektowe.Mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyTest {

    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Marcin");
        students.put(2, "Tomek");
        students.put(3, "Marcin");
        students.put(4, "Wiola");
        students.put(2, "krysiu");
        System.out.println(students.get(1));


        Map<Integer, String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);

        System.out.println(students.get(2));
        System.out.println(students.containsKey(2));
        System.out.println(students.containsValue("Wiola"));
        System.out.println();

        System.out.println(students.isEmpty());
        System.out.println(students.size());
        students.remove(3);
        System.out.println(students.size());
        System.out.println();

        for (Integer key : students.keySet()) {
            System.out.println(key);
            System.out.println(students.get(key));
        }

        System.out.println();

        for (String student : students.values() ) {
            System.out.println(student);
        }






    }
}
