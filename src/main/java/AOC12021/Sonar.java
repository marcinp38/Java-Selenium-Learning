package AOC12021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sonar{

    public static void main(String[] args) {

        List <Integer> list = new ArrayList();
        try{
            File lista = new File("C:\\projekty\\ZTA202201\\src\\main\\java\\AOC12021\\input");
            Scanner scanner = new Scanner(lista);
            while(scanner.hasNextLine()){

                String depth = scanner.nextLine();
                int intDepth = Integer.parseInt(depth);
                list.add(intDepth);
            }
        }catch(FileNotFoundException e){
            System.out.println("No file at the directory!!!");
            e.printStackTrace();
        }
        System.out.println("Counter: " + countDepthIncrease(list));
    }

    public static int countDepthIncrease(List<Integer>list){
        int depthCounter =0;
        for(int i= 1; i<list.size(); i++){
            if(list.get(i) > list.get(i-1)){
                depthCounter++;
            }
        }
        return depthCounter;
    }
}