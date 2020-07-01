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
public class HomeFrame extends JFrame implements ActionListener {

    Container container;
    JLabel userLabel;

    JButton button1;
    JButton button2;
    JButton salirButton;
    JButton perfilButton;

    IsologoPanel logoPanel;

    public HomeFrame(String title, IsologoPanel imagen) {
        super(title);
        this.logoPanel = imagen;
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void initComponents() {
        this.setBounds(10, 10, 500, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        Color primaryColor = new Color(255, 87, 87);
        container = getContentPane();
        container.setBackground(primaryColor);
        setLayoutManager();

        userLabel = new JLabel("Bienvenido Usuario");

        button1.setBackground(Color.WHITE);
        button2.setBackground(Color.WHITE);
        salirButton.setBackground(Color.WHITE);
        perfilButton = new JButton("Cerrar Sesion");
        perfilButton.setBackground(Color.WHITE);

        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        this.setVisible(true);
    }

    public void setLocationAndSize() {
        int logo_height_base = 500;
        logoPanel.setBounds(0, 0, logo_height_base, 500);

        userLabel.setBounds(10, logo_height_base + 10, 200, 30);

        button1.setBounds(10, logo_height_base + 45, 120, 30);
        button2.setBounds(150, logo_height_base + 45, 120, 30);
        salirButton.setBounds(290, logo_height_base + 45, 120, 30);
        perfilButton.setBounds(330, logo_height_base + 45, 120, 30);

    }

    public void addComponentsToContainer() {
        container.add(logoPanel);
        container.add(userLabel);

        container.add(button1);
        container.add(button2);
        container.add(salirButton);
    }

    public void addActionEvent() {
        button1.addActionListener(this);
        button2.addActionListener(this);
        salirButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salirButton) {
            new LoginArrendatarioFrame();
            this.dispose();
        }
        if (e.getSource() == button1) {
            new ReservarFrame();
            this.dispose();
        }
        if (e.getSource() == button2) {
            new HistorialFrame();
            this.dispose();
        }
    }
}
