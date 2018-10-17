package ExoFileWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WFichierClient1 {




        public void ecrire(Client[] clients, String fichier) throws IOException {

            FileWriter fw = new FileWriter(fichier);
            for(Client objetClient : clients){
                fw.write(objetClient.toString());
                fw.write("\n");
            }
            fw.close();
        }


    public void ecrire2(Client[] clients, String fichier) throws IOException {
        FileWriter fw = new FileWriter(fichier);
        BufferedWriter bw = new BufferedWriter(fw);
        for(Client objetClient : clients){
            bw.write(objetClient.toString());
            bw.write("\n");
        }
        fw.close();
    }








    /*FileWriter fw = new FileWriter("out.txt");
fw.write("simple method");
fw.close();


2:
FileWriter fw = new FileWriter("out.txt");
BufferedWriter bw = new BufferedWriter(fw);
bw.write("too much code");
bw.close();*/


}
