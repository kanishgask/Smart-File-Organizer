public class FileTypeClassifier {

    public static String classify(String fileName){

        fileName = fileName.toLowerCase();

        if(fileName.endsWith(".jpg") || fileName.endsWith(".png") || fileName.endsWith(".jpeg")){
            return "Images";
        }

        if(fileName.endsWith(".pdf") || fileName.endsWith(".docx") || fileName.endsWith(".txt")){
            return "Documents";
        }

        if(fileName.endsWith(".mp4") || fileName.endsWith(".mkv")){
            return "Videos";
        }

        if(fileName.endsWith(".zip") || fileName.endsWith(".rar")){
            return "Archives";
        }

        return "Others";
    }
}
