package zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ListFilesInDirectory {

    public void printDirectory(String directoryPath) {

        try {

            File file = new File(directoryPath);
            String[] files = file.list();

            for(int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        }
    }
}
