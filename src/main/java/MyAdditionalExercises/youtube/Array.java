package MyAdditionalExercises.youtube;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Marcin");
        names.add("Kasia");
        names.add("Wiola");
        names.add("Zenon");

        names.remove("Kasia");
        System.out.println(names.contains("Zenon"));
        System.out.println(names.isEmpty());

        Collections.sort(names);
        for (String name:
             names) {
            System.out.println(name);
        }

        Set<String> meals = new HashSet<>();
        meals.add("Pizza");
        meals.add("Salad");
        meals.add("Burger");
        meals.add("Pizza");

        for (String meal:meals) {
            System.out.println(meal);
        }

        Map<String, String> nameToMeal = new HashMap<>();

        nameToMeal.put("Marcin", "Pizza");
        nameToMeal.put("Wiola", "Burger");

        System.out.println(nameToMeal.get("Marcin"));


        }



    }

