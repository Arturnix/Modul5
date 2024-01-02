package zadanie5;

import java.io.*;

public class FileComparator {
    public boolean areTextFilesEqual(String filePath1, String filePath2) throws FileNotFoundException {

        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        FileReader fileReader1 = new FileReader(file1);
        FileReader fileReader2 = new FileReader(file2);

        String lineFile1;
        String lineFile2;

        try (BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
             BufferedReader bufferedReader1 = new BufferedReader(fileReader1)) {

            while(((lineFile1 = bufferedReader1.readLine()) != null) && ((lineFile2 = bufferedReader2.readLine()) != null)) {

                if (!lineFile1.equals(lineFile2)) {
                    return false;
                }
            }

            if(((lineFile1 = bufferedReader1.readLine()) != null) || ((lineFile2 = bufferedReader2.readLine()) != null)) {
                return false;
            }

            return true;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}
