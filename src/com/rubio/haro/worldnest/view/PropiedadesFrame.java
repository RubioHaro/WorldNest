package com.rubio.haro.worldnest.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class PropiedadesFrame extends HomeFrame {

    public PropiedadesFrame() {
        super("Propiedades Arrendador", new IsologoArrendador());
        button1 = new JButton("Registro");
        button2 = new JButton("Historial");
        salirButton = new JButton("Regresar");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salirButton) {
            new LoginArrendadorFrame();
            this.dispose();
        }
        if (e.getSource() == button1) {
            new PropiedadesFrame();
            this.dispose();
        }
        if (e.getSource() == button2) {
            new HistorialFrame();
            this.dispose();
        }
    }

}
