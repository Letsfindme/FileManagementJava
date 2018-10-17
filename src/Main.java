import java.io.File;
import java.io.FileFilter;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("java.io.tmpdir"));
        Employee toto = new Employee("fadi", "noufal");


        // répertoire de recherche
        String rep = "/home/foxy/Documents/SpringBoot/FileClass/src/";
        // construction d'un fichier sur ce répertoire
        File repFile = new File(rep);
        File[] fichiersJava;

        try {
            // filtrage du contenu de ce répertoire
            // on passe en paramètre une instance de classe anonyme
            //listFiles Returns [] an array of abstract pathnames denoting the files and directories in the directory denoted by this abstract pathname
            fichiersJava = repFile.listFiles(new FileFilter() {
                // cette interface n'a qu'une unique méthode
                public boolean accept(File pathname) {
                    // on récupère le nom de ce fichier...
                    String fileName = pathname.getName();
                    // ... et on teste s'il se termine par .java
                    return fileName.endsWith(".java");
                }
            });
            for (File path : fichiersJava) {
                System.out.print(path);
            }
        } catch (NullPointerException n) {
            n.printStackTrace();
        }
    }

}

