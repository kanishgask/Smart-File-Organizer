import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {

    public List<File> scanFolder(String path){

        List<File> files = new ArrayList<>();

        File folder = new File(path);

        File[] fileList = folder.listFiles();

        if(fileList != null){

            for(File file : fileList){

                if(file.isFile()){
                    files.add(file);
                }
            }
        }

        return files;
    }
}
