package Helper;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    private static final String FIRST_STRING = "Idemne, quod iucunde?";
    private static final String SECOND_STRING = "Lorem ipsum";

    public void findStrings() {
        checkFirstSample(FIRST_STRING);
        checkFirstSample(SECOND_STRING);
        checkSecondSample(FIRST_STRING);
        checkSecondSample(SECOND_STRING);
        checkThirdSample(FIRST_STRING);
        checkThirdSample(SECOND_STRING);
    }

    public void checkFirstSample(String str) {
        File file = new File("downloadFiles/sample1.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(str)) {
                    System.out.println("I found \"" + str + "\" in the Sample1.txt");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void checkSecondSample(String str) {
        File file = new File("downloadFiles/sample2.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(str)) {
                    System.out.println("I found \"" + str + "\" in the Sample2.txt");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void checkThirdSample(String str) {
        File file = new File("downloadFiles/sample3.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(str)) {
                    System.out.println("I found \"" + str + "\" in the Sample3.txt");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
