import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WFichierClient {

    public WFichierClient() {
    }

    public static void main(String[] args) {
        Client cl1= new Client("fadi","noufal","1");


        String data = "I will write this String to File in Java";
        int noOfLines = 10000;
        writeUsingFileWriter(cl1.toString());

        writeUsingBufferedWriter(data, noOfLines);

        writeUsingFiles(data);

        writeUsingOutputStream(data);
        System.out.println("DONE");
    }



    public void ecrire(Client[] myClients, String myFile) throws IOException{

        File intstenceFile;
        intstenceFile = new File(System.getProperty("user.dir") + "/myFile.txt");

        boolean booFile = intstenceFile.createNewFile();
        if (booFile){
            System.out.println("Le fichier a été bien créé");
        } else {
            System.out.println("Allready exist");
        }



    }

    /**
     * Use Streams when you are dealing with raw data
     * @param data
     */
    private static void writeUsingOutputStream(String data) {
        OutputStream os = null;
        try {
            os = new FileOutputStream(new File("/home/foxy/Documents/SpringBoot/FileClass/NewRep/os.txt"));
            os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Use Files class from Java 1.7 to write files, internally uses OutputStream
     * @param data
     */
    private static void writeUsingFiles(String data) {
        try {
            Files.write(Paths.get("/home/foxy/Documents/SpringBoot/FileClass/NewRep/files.txt"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Use BufferedWriter when number of write operations are more
     * It uses internal buffer to reduce real IO operations and saves time
     * @param data
     * @param noOfLines
     */
    private static void writeUsingBufferedWriter(String data, int noOfLines) {
        File file = new File("/home/foxy/Documents/SpringBoot/FileClass/NewRep/BufferedWriter.txt");
        FileWriter fr = null;
        BufferedWriter br = null;
        String dataWithNewLine=data+System.getProperty("line.separator");
        try{
            fr = new FileWriter(file);
            br = new BufferedWriter(fr);
            for(int i = noOfLines; i>0; i--){
                br.write(dataWithNewLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Use FileWriter when number of write operations are less
     *
     */
    private static void writeUsingFileWriter(String cl1) {
        File file = new File("/home/foxy/Documents/SpringBoot/FileClass/NewRep/FileWriter.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(cl1.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            //close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

