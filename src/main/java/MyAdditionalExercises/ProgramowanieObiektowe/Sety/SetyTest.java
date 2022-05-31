package MyAdditionalExercises.ProgramowanieObiektowe.Sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {

    public static void main(String[] args) {

        Set<String> fruit = new HashSet<>();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("plum");
        fruit.add("cherry");
        fruit.add("cherry");

        System.out.println(fruit.contains("cherry"));
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());

        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onion");
        vege.add("cucumber");

        vege.addAll(fruit);

        System.out.println(vege.size());
        System.out.println();

        for (String fruitt : fruit) {
            System.out.println(fruitt);
        }




    }
}
