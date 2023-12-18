package zadanie1;

import java.io.File;

public class ListFilesInDirectory {

    public void printDirectory(String directoryPath) {


        try {

            File file = new File(directoryPath);
            String[] files = file.list();

            for(int i = 0; i < files.length; i++) {
                System.out.println(files[i]);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
