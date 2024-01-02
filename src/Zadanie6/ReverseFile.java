package Zadanie6;

import java.io.*;

public class ReverseFile {
    public boolean invertFile(String filepath) {

        String[] fileWords;

        try {

            File fileToReverse = new File(filepath);
            File reversedFile = new File("src/Zadanie6/reversedFile.txt");


            FileReader fileReader = new FileReader(fileToReverse);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(reversedFile);
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
