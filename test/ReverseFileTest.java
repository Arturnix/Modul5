import Zadanie6.ReverseFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseFileTest {

    ReverseFile testObject = new ReverseFile();

    private String readFromFile(String filePath) {

        String reversedFileContent = "";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while((line = bufferedReader.readLine()) != null) {

               reversedFileContent += line;
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Reading file error!");
            e.printStackTrace();
        }

        return reversedFileContent;
    }

    @Test
    public void invertFile() {
        Assertions.assertTrue(testObject.invertFile("src/Zadanie6/fileToReverse.txt"));
    }

    @Test
    public void compareInvertedFile() {
        Assertions.assertEquals(".kota ma Ala", readFromFile("src/Zadanie6/reversedFile.txt"));
        //lub mozna tez wrzucic w plik odwrocony tekst i skorzystac z metody FileComparator
    }
}
