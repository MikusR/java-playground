package info.mikusr;

import java.io.File;
import java.io.IOException;

public class files {
    public static void main(String[] arg) {
        File directory = new File("testfiles");
        File file = new File("testfiles/file.file");
        Boolean dirCreated = directory.mkdir();
        if (dirCreated) {
            System.out.println("directory was successfully created.");
        } else {
            System.out.println("directory was not created.");
        }
        System.out.println(File.separator);
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path: " + file.getParent());

        try {
            if (file.createNewFile()) {
                System.out.println("created " + file.getName());
            } else {
                System.out.println("already exists");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
