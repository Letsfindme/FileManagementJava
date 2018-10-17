import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        File fileTest;
        fileTest = new File(System.getProperty("user.dir") + "/TestDelet0.java");

        if (fileTest.exists()) {
            System.out.println("this file allready exist");
        }

        boolean boo;
        try {
            boo = fileTest.createNewFile();
            if (!boo) {
                System.out.println("!boo this file allready exist");
            } else {
                System.out.println("!boo this file is has been created, le fichier a bien été créé");
            }

            File rep;
            rep = new File("NewRep");
            rep.mkdir();

            if (rep.isDirectory()) {
                String[] contenuRep = rep.list();
                for (int i = 0; i < contenuRep.length; i++) {
                    System.out.println(contenuRep[i]);
                }
            }

            fileTest.renameTo(new File(System.getProperty("user.dir") +"/NewRep/TestRenameTo"));


           // System.out.println(rep.getAbsolutePath());
           // boolean supprime = fileTest.delete();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
