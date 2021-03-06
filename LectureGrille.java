import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * La classe <code>LectureGrille</code> est utilisée pour lire un fichier
 * contenant les informations d'une grille et y traduire pour la mettre dans un
 * tableau
 * 
 * @version 1.1
 * @author Alban Stelzle, Marcus Antoine
 */
public class LectureGrille {
    private int[][] grille = new int[9][9];
    private String nomG;

    /**
     * Constructeur qui récupère le nom de la grille(donc du fichier)
     * 
     * @param filename String
     */
    public LectureGrille(String filename) {
        this.nomG = filename;
    }

    /**
     * Méthode qui lit un fichier et renvoie la grille
     * 
     * @return grille int[][]
     */
    public int[][] read() {
        int temp = 0;
        int[] temp3 = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        String temp2;

        try {
            File fichierG = new File("./grille/" + this.nomG + ".gri");
            /* écriture fichier */
            try {

                DataInputStream file = new DataInputStream(new FileInputStream(fichierG));

                for (int i = 0; i < 9; i++) {
                    temp = file.readInt();
                    temp2 = "" + temp;

                    for (int y = 0; y < temp2.length(); y++) {
                        temp3[8 - y] = Integer.parseInt("" + temp2.charAt(temp2.length() - 1 - y));

                    }
                    for (int y = 0; y < 9; y++) {
                        this.grille[i][y] = temp3[y];
                        temp3[y] = 0; // on reset temp3 pour pas que ca affecte les prochaines valeurs

                    }
                }
                file.close();
            } catch (FileNotFoundException e) {// si fichier n existe pas
                System.err.println("pas de fichier trouver : " + e.getMessage());
            } /* le reste */

        } catch (IOException e) {
            System.err.println(e.toString());
        }
        return this.grille;

    }
}