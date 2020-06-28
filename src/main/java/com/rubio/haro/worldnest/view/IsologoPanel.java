package com.rubio.haro.worldnest.view;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class IsologoPanel extends JPanel {

    private BufferedImage image;

    public IsologoPanel() {
        File file = new File("C:\\\\Users\\\\chavo\\\\OneDrive\\\\Documentos\\\\NetBeansProjects\\\\WorldNest\\\\src\\\\main\\\\java\\\\com\\\\rubio\\\\haro\\\\worldnest\\\\view\\\\logo.png");
        try {
            image = ImageIO.read(file);
        } catch (IOException ex) {
            System.out.println("Exception: " + ex + " Route: " + file.getAbsolutePath());
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);         
        this.setVisible(true);
    }
}
