import zadanie1.ListFilesInDirectory;
import zadanie2.OperationsOnFile;

public class Main {
    public static void main(String[] args) {

        //Zadanie1
        /*ListFilesInDirectory fileList = new ListFilesInDirectory();
        fileList.printDirectory();*/

        //Zadanie2
        OperationsOnFile file = new OperationsOnFile();
        file.writeUserInputToFile();
        file.readFromFile("");

        }
    }