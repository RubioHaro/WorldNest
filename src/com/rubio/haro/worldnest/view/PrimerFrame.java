package com.rubio.haro.worldnest.view;

import com.rubio.haro.worldnest.model.Arrendatario;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class PrimerFrame extends JFrame implements ActionListener {

    Container container;
    JButton Arrendatarios;
    JButton Arrendadores;
    IsologoPanel logoPanel;

    public PrimerFrame() {
        super("Elegir Subsistema");
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    private void initComponents() {
        this.setLocationRelativeTo(null);
        this.setBounds(10, 10, 500, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        Color primaryColor = new Color(255, 87, 87);
        container = getContentPane();
        container.setBackground(primaryColor);
        setLayoutManager();
        logoPanel = new IsologoArrendatario();

        Arrendatarios = new JButton("Arrendatarios: Renta Facil");
        Arrendatarios.setBackground(Color.WHITE);
        Arrendadores = new JButton("Arrendadores: Arrenda Seguro");
        Arrendadores.setBackground(Color.WHITE);

        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        this.setVisible(true);
    }

    public void setLocationAndSize() {
        int logo_height_base = 500;
        logoPanel.setBounds(0, 0, logo_height_base, 500);

        Arrendatarios.setBounds(20, logo_height_base + 45, 220, 50);
        Arrendadores.setBounds(250, logo_height_base + 45, 220, 50);

    }

    public void addComponentsToContainer() {
        container.add(logoPanel);
        container.add(Arrendatarios);
        container.add(Arrendadores);
    }

    public void addActionEvent() {
        Arrendatarios.addActionListener(this);
        Arrendadores.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Arrendatarios) {
            new LoginArrendatarioFrame();
        }
        if (e.getSource() == Arrendadores) {
            new LoginArrendadorFrame();
        }
    }
}
