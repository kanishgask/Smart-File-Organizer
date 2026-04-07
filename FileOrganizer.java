import java.io.File;
import java.util.List;

public class FileOrganizer {

    public void organize(String path){

        FileScanner scanner = new FileScanner();
        List<File> files = scanner.scanFolder(path);

        for(File file : files){

            String category = FileTypeClassifier.classify(file.getName());

            FileMover mover = new FileMover();
            mover.moveFile(file, path + "/" + category);
        }
    }
}
