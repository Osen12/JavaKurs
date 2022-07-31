package Files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("testowy.txt");

        if (file.delete()) {
            System.out.println("Usunelismy plik");
        } else {
            System.out.println("Nie udalo sie");
        }

    }
}
