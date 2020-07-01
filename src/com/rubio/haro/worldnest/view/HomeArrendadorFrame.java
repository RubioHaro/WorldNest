package com.rubio.haro.worldnest.view;

import java.awt.event.ActionEvent;
import javax.swing.JButton;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class HomeArrendadorFrame extends HomeFrame {

    public HomeArrendadorFrame() {
        super("Home Arrendador", new IsologoArrendador());
        button1 = new JButton("Propiedades");
        button2 = new JButton("Historial");
        salirButton = new JButton("Cerrar Sesion");
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
