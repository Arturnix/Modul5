import Zadanie6.ReverseFile;
import zadanie1.ListFilesInDirectory;
import zadanie2.OperationsOnFile;
import zadanie3.GeometricFigure;
import zadanie3.Rectangle;
import zadanie4.Square;
import zadanie5.FileComparator;

public class Main {
    public static void main(String[] args) {

        //Zadanie1
        /*ListFilesInDirectory fileList = new ListFilesInDirectory();
        fileList.printDirectory();*/

        //Zadanie2
        /*OperationsOnFile file = new OperationsOnFile();
        file.writeUserInputToFile();
        file.readFromFile("");*/

        //Zadanie3
        //GeometricFigure rectangle1 = new Rectangle(2, 5);
        //System.out.println(rectangle1.calculateArea());

        //Zadanie4
        //GeometricFigure square = new Square(2,2);
        //System.out.println(((Square) square).calculateDiameter());

        //Zadanie5
        //FileComparator fileComparator = new FileComparator();
        //System.out.println(fileComparator.areTextFilesEqual("", ""));

        //Zadanie6
        ReverseFile reverseFile = new ReverseFile();
        reverseFile.invertFile("");
        }

    }