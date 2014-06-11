package VM5000;import javax.imageio.ImageIO;
import javax.swing.*;import javax.swing.ImageIcon;import javax.swing.JPanel;
import java.awt.*;
import java.awt.Graphics;import java.awt.Image;import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;import java.lang.Override;import java.lang.String;import java.lang.System;

public class BilderPanel extends JPanel {
    private Image img;

    public BilderPanel(String imgUrl) {
        // load the background image

            img = createImageIcon(imgUrl).getImage();
    }


    public ImageIcon createImageIcon(String pfad) {
        java.net.URL imgURL = getClass().getResource(pfad);
        if (imgURL != null) {
            return new ImageIcon(imgURL, "");
        }
        else {
            System.out.println("Konnte " + pfad + " nicht finden.");
            return null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // paint the background image and scale it to fill the entire space
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}
