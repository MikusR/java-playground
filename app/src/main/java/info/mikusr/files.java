package info.mikusr;

import java.io.File;

public class files {
    public static void main(String[] arg) {
        File file = new File("files/file.file");
        System.out.println(File.separator);
        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path: " + file.getParent());
    }
}
