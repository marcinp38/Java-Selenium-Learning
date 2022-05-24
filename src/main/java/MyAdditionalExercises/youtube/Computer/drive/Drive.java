package MyAdditionalExercises.youtube.Computer.drive;

import MyAdditionalExercises.youtube.Computer.file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();

    File findFile(String name);

}
