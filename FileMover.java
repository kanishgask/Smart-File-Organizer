import java.io.File;

public class FileMover {

    public void moveFile(File file, String destinationFolder){

        File destFolder = new File(destinationFolder);

        if(!destFolder.exists()){
            destFolder.mkdirs();
        }

        File newFile = new File(destFolder, file.getName());

        boolean success = file.renameTo(newFile);

        if(success){
            System.out.println("Moved: " + file.getName());
        }else{
            System.out.println("Failed to move: " + file.getName());
        }
    }
}
