import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== SMART FILE ORGANIZER =====");
        System.out.print("Enter folder path: ");

        String path = scanner.nextLine();

        FileOrganizer organizer = new FileOrganizer();
        organizer.organize(path);

        System.out.println("Files organized successfully!");
    }
}
