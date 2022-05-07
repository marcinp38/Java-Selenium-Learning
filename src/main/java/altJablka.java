import java.util.Scanner;

public class altJablka {
    public static void main(String[] args) {
        int qty;
        String fruit;
        Scanner in = new Scanner(System.in);
        System.out.println("Gimme a fruit: ");
        fruit = in.nextLine();

        switch(fruit) {
            case "bananas":
            case "oranges":
            case "apples":
                System.out.println("Gimme quantity of " + fruit+ ": ");
                qty = in.nextInt();
                if (qty < 100)
                    System.out.println("it's enough of " + fruit + " in here, and there is " + (100 - qty) + " left");
                else
                    System.out.println("It's " + (qty - 100) + "kg too much of " + fruit + " that you want");
                break;
            default:
                System.out.println("No such thing in store");
        }
    }
}
