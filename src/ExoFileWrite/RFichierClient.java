package ExoFileWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RFichierClient {


    public int compteurLine(BufferedReader br) throws IOException{

        //le contenu de chaque line
        String line ;

        //le nombre de lignes
        int nblines = 0;
        while( (line =  br.readLine()) !=null){
            nblines++;
        }


        return nblines;
    }

    public void lire(String myFile)throws IOException{
        BufferedReader br = new BufferedReader(
                new FileReader(
                        new File(myFile)
                ));

        Client[]clients = new Client[compteurLine(br)];


    }


}
