package Zadanie6;

import java.io.*;

public class ReverseFile {

   String[] fileWords;
    public boolean invertFile(String filepath) {

        try {

            File fileToReverse = new File(filepath);
            File reversedFile = new File("");


            FileReader fileReader = new FileReader(fileToReverse);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;

            while((line = bufferedReader.readLine()) != null) {

                fileWords = line.split("\\b");

                for(int i = fileWords.length-1; i >= 0; i--) {
                    bufferedWriter.write(fileWords[i]);
                }
                bufferedWriter.write('\n');
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
