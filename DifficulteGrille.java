import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * La classe <code>DifficulteGrille</code> est utilisée pour afficher un menu où
 * plusieurs difficultés sont proposées au joueur
 * 
 * @version 1.1
 * @author Alban Stelzle, Marcus Antoine
 */
public class DifficulteGrille {
    /**
     * Constructeur affichant un menu proposant différentes difficultés aux joueurs
     * (facile, moyen, difficile)
     */
    public DifficulteGrille() {
        JFrame fenetre = new JFrame();
        JButton facile = new JButton("FACILE");
        JButton moyen = new JButton("MOYEN");
        JButton difficile = new JButton("DIFFICILE");
        JButton retour = new JButton("RETOUR");
        JPanel panneau = new JPanel();
        DifficulteGrilleEvent ctrl = new DifficulteGrilleEvent(fenetre);
        panneau.setLayout(null);

        facile.setLocation(150, 50);
        moyen.setLocation(150, 150);
        difficile.setLocation(150, 250);
        retour.setLocation(150, 400);

        facile.setSize(200, 40);
        moyen.setSize(200, 40);
        difficile.setSize(200, 40);
        retour.setSize(200, 40);

        facile.addActionListener(ctrl);
        moyen.addActionListener(ctrl);
        difficile.addActionListener(ctrl);
        retour.addActionListener(ctrl);

        panneau.add(facile);
        panneau.add(moyen);
        panneau.add(difficile);
        panneau.add(retour);
        panneau.setSize(fenetre.getWidth(), fenetre.getHeight());

        fenetre.add(panneau);
        fenetre.setSize(500, 500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

    }
}