import java.util.Scanner;

public class Bomb {
    public static void main(String[] args) throws InterruptedException {
        int count;

        Scanner in = new Scanner(System.in);
        System.out.print("Gimme the number: ");
        count = in.nextInt();

        for(int i=count; i>0 ; i--)
        {
            System.out.println("Bomba wybuchnie za: " +i);
            Thread.sleep(1000);
        }
        System.out.println("BOOM!!");
        Thread.sleep(2000);
        while(count>0){
            System.out.println("Bomba eksploduje za: " +count);
            Thread.sleep(1000);
            count--;
        }
        System.out.println("Kaboom!!");

    }
}
