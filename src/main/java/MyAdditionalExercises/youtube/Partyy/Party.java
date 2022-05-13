package MyAdditionalExercises.youtube.Partyy;


import java.util.*;

public class Party {
    private List <Guest> guests = new ArrayList<>();
    private Set<String> meals = new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();
    
    Scanner scanner = new Scanner(System.in);
    public void addGuests() {
        System.out.println("Podaj imie goscia: ");
        String name = scanner.nextLine();
        System.out.println("Podaj preferowany posilek: ");
        String meal = scanner.nextLine();
        System.out.println("Podaj numer telefonu: ");
        int phoneNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("czy to weganin? (Y/N) ");
        String isVeganString = scanner.nextLine();

        boolean isVegan;

        if (isVeganString.equals("Y")) {
            isVegan = true;
        }
        else{
            isVegan = false;
        }
        Guest guest = new Guest(name, meal, phoneNumber, isVegan);

        meals.add(meal);
        phoneToGuest.put(phoneNumber, guest);
        guests.add(guest);

    }
public  void displayMeals(){
    for (String meal:meals)
    {
        System.out.println(meal);
    }
    System.out.println();
}
public void displayGuestByPhoneNumber(){
    Integer phoneNumber = Integer.valueOf(scanner.nextLine());
    Guest guests=phoneToGuest.get(phoneNumber);
    guests.displayGuestInfo();
    System.out.println();

}
    public void displayGuests() {
        for (Guest guest:guests) {
            guest.displayGuestInfo();
            System.out.println();
        }
    }


}
