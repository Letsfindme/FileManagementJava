package ExoFileWrite;

import java.io.IOException;

public class App {
    public static void main(String[] args) {

        Client cl1= new Client("fadi","noufal","1");
        Client cl2= new Client("c'est","moi","2");
        Client cl3= new Client("ce n'est ","pas moi","2");

        Client[] clients= new Client[3];
        clients[0]= cl1;
        clients[1]= cl2;
        clients[2]= cl3;

        WFichierClient1 test = new WFichierClient1();
        String fichier = System.getProperty("user.dir")+"/NewRep/fileText.txt";
        try {
            test.ecrire(clients, fichier);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
