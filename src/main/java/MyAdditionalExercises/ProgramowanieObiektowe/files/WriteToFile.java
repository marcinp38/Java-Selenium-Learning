package MyAdditionalExercises.ProgramowanieObiektowe.files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

    public static void main(String[] args) throws IOException {

        FileWriter writer = new FileWriter("test.txt");
        writer.write("alalalala");
        writer.write("New Text");
        writer.close();
    }
}
