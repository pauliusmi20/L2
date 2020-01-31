import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class TestTortue {


    public static void main(String[] args) {

        // Construction d'une image 600x600
        int nColonnes = 600;
        int nLignes = 600;
        
        BufferedImage im = // objet image en mémoire
                new BufferedImage(nColonnes, nLignes, BufferedImage.TYPE_INT_ARGB);

        // mise au bleu de tous les pixels pour mieux voir
        for(int i=0; i<im.getWidth();i++)
            for(int j=0; j<im.getHeight();j++)
                im.setRGB(i, j, Color.blue.getRGB()); // mettre le pixel (i,j) en bleu

        // récupération d'un stylo pour écrire dans l'image
        Graphics g = im.getGraphics();

        // création de la tortue
        Tortue t = new Tortue(g); // direction initiale (1,0),
                                 // position (0,0) = coin haut gauche

        t.leverStylo(); // ne pas écrire
        t.rotation(Math.PI/4); // aller vers le centre (ATTENTION AU SENS DE ROTATION)
        t.avancer(200); // approximativement au centre

        // Dessin
        t.baisserStylo();
				//t.rosace(500);  
				t.rond(100000);         // Sauver l'image dans un fichier
        try {
            File outputfile = new File("saved.png");
            ImageIO.write(im, "png", outputfile);
         } catch (IOException e) {
            System.out.println("Erreur lors de la sauvegarde");
         }
    }
}
