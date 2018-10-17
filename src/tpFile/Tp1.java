package tpFile;

import java.util.Scanner;

public class Tp1 {

    public static  double readNumber(String line){

        double note = 0;
        try {
            note = Double.parseDouble(line);
            if (note >= 0 && note <= 20)
            {
                return note;
            }// end if
            else
            {
                System.out.println("Rentrez un nombre entre 0 et 20");
                return -1;
            }
        } catch (NumberFormatException e){
            System.out.println("Rentrez un nombre");
            return -1;
        }


    }




    public static void main(String[] args) {

        System.out.println("Enter your numbers....");
        Scanner scan = new Scanner(System.in);
        String line = null;
        double total = 0;
        int nbNote = 0;
        double statusNombre = 0;
        boolean end = false;

        while (!end) {
            while (!(line = scan.nextLine()).equals("fini")) {
                statusNombre = readNumber(line);

                if (statusNombre != -1) {
                    total += statusNombre;
                    nbNote++;
                }

            }
            if (nbNote != 0) {
                System.out.println("la moyenne est de " + (total / nbNote));
                end = true;
            } else {
                System.out.println("entrez au moins une note !");
            }
        }
    }
}
