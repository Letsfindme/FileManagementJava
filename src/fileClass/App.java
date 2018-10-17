package fileClass;

import java.io.File;
import java.io.FileFilter;

public class App {

    public static void main(String[] args) {
        String rep = "/home/foxy/Documents/SpringBoot/FileClass/NewRep/";

        File repFile = new File(rep);

        File[] listFile = repFile.listFiles(
                new FileFilter() {
                    @Override
                    public boolean accept(File file) {
                        String fileName = file.getName();
                        return fileName.endsWith(".txt");
                    }
                }
        );
        for (File path : listFile) {
            System.out.println(path);
        }
    }
}
