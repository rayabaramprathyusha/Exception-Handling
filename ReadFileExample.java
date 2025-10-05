import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        Scanner sc = null;
        try {
            File file = new File("data.txt");
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
        } finally {
            if (sc != null) sc.close();
        }
    }
}
