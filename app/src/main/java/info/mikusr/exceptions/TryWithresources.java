package info.mikusr.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithresources {
    public static void main(String[] args) {
        File inputFile = new File("failes/numbrs.txt");
        File outputFile = new File("failes/outputs.txt");

        try (
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile)) {

            while (fileReader.hasNext()) {
                fileWriter.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }

}
