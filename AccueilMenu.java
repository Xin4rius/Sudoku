import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AccueilMenu {

public AccueilMenu(){
        JFrame fenetre = new JFrame();
        JButton jouer = new JButton("JOUER");
        JButton quitter = new JButton("QUITTER");
        JPanel panneau = new JPanel();
        JLabel titre = new JLabel("SUDOKU");
        Font policeTitre = new Font("Arial",Font.BOLD,20);
        AccueilEvenement ctrl = new AccueilEvenement(fenetre);
        panneau.setLayout(null);

        titre.setFont(policeTitre);
        titre.setHorizontalAlignment(JLabel.CENTER);

        titre.setLocation(150,50);
        jouer.setLocation(150, 150);
        quitter.setLocation(150,300);

        titre.setSize(200, 40);
        jouer.setSize(200,40);
        quitter.setSize(200,40);

        jouer.addActionListener(ctrl);
        quitter.addActionListener(ctrl);

        panneau.add(titre);
        panneau.add(jouer);
        panneau.add(quitter);
        panneau.setSize(fenetre.getWidth(),fenetre.getHeight());

        fenetre.add(panneau);
        fenetre.setSize(500,500);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

}
}
