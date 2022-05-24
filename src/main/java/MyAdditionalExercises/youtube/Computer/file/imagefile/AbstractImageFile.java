package MyAdditionalExercises.youtube.Computer.file.imagefile;

import MyAdditionalExercises.youtube.Computer.file.AbstractFile;
import MyAdditionalExercises.youtube.Computer.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String name, int size) {
        super(name, size);
    }

 @Override
    public FileType getType() {
        return FileType.IMAGE;
    }
}
