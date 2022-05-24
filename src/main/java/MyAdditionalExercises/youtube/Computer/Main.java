package MyAdditionalExercises.youtube.Computer;

import MyAdditionalExercises.youtube.Computer.drive.Drive;
import MyAdditionalExercises.youtube.Computer.drive.HDDDrive;
import MyAdditionalExercises.youtube.Computer.file.File;
import MyAdditionalExercises.youtube.Computer.file.imagefile.GIFImageFile;
import MyAdditionalExercises.youtube.Computer.file.imagefile.JPGImageFile;
import MyAdditionalExercises.youtube.Computer.file.musicfile.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        GIFImageFile gif1 = new GIFImageFile("nazwa1gif", 100);
        JPGImageFile jpg1 = new JPGImageFile("nazwa1.jpg", 200,80);

        MP3MusicFile mp31 = new MP3MusicFile("plik.mp3", 4000, "Marilyn Manson", "Broken Needle", 100);

        Drive drive = new HDDDrive();
        drive.addFile(gif1);
        drive.addFile(jpg1);
        drive.addFile(mp31);

        drive.listFiles();
        File file = drive.findFile("plik.mp3");
        System.out.println(file.getSize());

    }
}