package VM5000;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.lang.String;

public class KatalogwahlFenster {

    public KatalogwahlFenster() {

        //Fenster für die Katalogwahl
        JFrame katalogFenster = new JFrame("Katalogauswahl");
        katalogFenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Hintergrundbild
        BilderPanel katalogBg = new BilderPanel("Img/katalogwahlBg.png");

        //VM5000.BilderPanel
        JPanel katalogPanel = new JPanel(new GridBagLayout());
        katalogPanel.setOpaque(false);

        //Buttons werden hier erstellt
        ImageIcon deutschEnglischIcon = new BildBauer().createImageIcon("Img/deEngButton.png");
        DeinButton deutschEnglisch = new DeinButton(deutschEnglischIcon);

        ImageIcon englischDeutschIcon = new BildBauer().createImageIcon("Img/engDeButton.png");
        DeinButton englischDeutsch = new DeinButton(englischDeutschIcon);

        ImageIcon zurueckIcon = new BildBauer().createImageIcon("Img/zurueckGrossButton.png");
        DeinButton zurueck = new DeinButton(zurueckIcon);

        //hier werden alle Elemente dem katalogPanel hinzugefügt
        katalogPanel.add(deutschEnglisch,new GridBagConstraints(0,0,0,1,1,1,GridBagConstraints.PAGE_START,GridBagConstraints.NONE,new Insets(120,0,0,0),0,0));
        katalogPanel.add(englischDeutsch,new GridBagConstraints(0,1,0,1,1,1,GridBagConstraints.CENTER,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));
        katalogPanel.add(zurueck,new GridBagConstraints(0,2,0,1,1,1,GridBagConstraints.PAGE_END,GridBagConstraints.NONE,new Insets(0,0,0,0),0,0));

        katalogBg.add(katalogPanel);

        //Komponenten zum Fenster hinzufügen
        katalogFenster.add(katalogBg);

        //Fenstergröße setzen und anzeigen lassen
        katalogFenster.setSize(415,400);
        katalogFenster.setVisible(true);
    }

    public static void main(String[] a){

        new KatalogwahlFenster();

    }

}