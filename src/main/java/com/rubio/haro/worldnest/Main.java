package com.rubio.haro.worldnest;

import com.rubio.haro.worldnest.view.HomeFrame;
import com.rubio.haro.worldnest.view.IsologoPanel;
import com.rubio.haro.worldnest.view.LoginFrame;
import com.rubio.haro.worldnest.view.RegistroFrame;
import com.rubio.haro.worldnest.view.ReservarFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class Main {

    public static void main(String[] args) {
        /*
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new LoginFrame();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        new LoginFrame();

    }
}
