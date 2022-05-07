import java.util.Scanner;

public class altJablka {
    public static void main(String[] args) {
        int qty;
        String fruit;
        Scanner in = new Scanner(System.in);
        System.out.print("Fruit: ");
        fruit = in.nextLine();

        switch (fruit) {
            case "bananas":
            case "oranges":
            case "apples" :
                System.out.print("Quantity: ");
                qty = in.nextInt();
                if (qty<100)
                    System.out.println("We can sell you this "+ fruit + " and there is also "+(100-qty) + "kg space more");
                else
                    System.out.println(fruit + " is "+(qty -100) + "kg too much");
                break;
            default:
                System.out.println("No such thing as: "+fruit);
        }


    }
}