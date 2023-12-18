package zadanie2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class OperationsOnFile {

    public boolean writeUserInputToFile() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwe pliku, ktory chcesz utworzyc:");
        String fileName = scanner.nextLine();

            try {

                File file = new File(fileName + ".txt");

                if(file.exists() && file.canWrite()) {
                    FileWriter fileWriter = new FileWriter(fileName + ".txt");

                    System.out.println("Podaj dane do zapisania w pliku " + fileName + ".txt:");
                    String fileContent = scanner.nextLine();

                    int spaceCounter = 0;
                    for(int i = 0; i < fileContent.length(); i++) {

                        if(fileContent.charAt(i) == ' ') {
                            spaceCounter++;
                        }
                        if(spaceCounter == 4) {
                            fileWriter.write("\n");
                                spaceCounter = 0;
                        } else {
                            fileWriter.write(fileContent.charAt(i));
                        }
                    }

                    scanner.close();
                    fileWriter.close();
                }
                return true;
            } catch (IOException  e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                return false;
            }
    }

    public void readFromFile(String fileName) {

        try {

            File readFile = new File(fileName + ".txt");
            Scanner scanner = new Scanner(readFile);

            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Unexcpected error occurred!");
            e.printStackTrace();
        }
    }

}
