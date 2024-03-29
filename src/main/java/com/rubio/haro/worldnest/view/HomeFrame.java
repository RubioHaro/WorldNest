package com.rubio.haro.worldnest.view;

import com.rubio.haro.worldnest.Respuesta;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class HomeFrame extends JFrame implements ActionListener {

    Container container;
    JLabel userLabel;

    JButton reservarButton;
    JButton historialButton;
    JButton salirButton;
    JButton perfilButton;

    IsologoPanel logoPanel;

    public HomeFrame() {
        super("Home");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    private void initComponents() {
        this.setBounds(10, 10, 500, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        Color primaryColor = new Color(255, 87, 87);
        container = getContentPane();
        container.setBackground(primaryColor);
        setLayoutManager();
        logoPanel = new IsologoPanel();

        userLabel = new JLabel("Bienvenido Usuario");

        reservarButton = new JButton("Reservar");
        reservarButton.setBackground(Color.WHITE);
        historialButton = new JButton("Historial");
        historialButton.setBackground(Color.WHITE);
        salirButton = new JButton("Cerrar Sesion");
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

        reservarButton.setBounds(10, logo_height_base + 45, 120, 30);
        historialButton.setBounds(150, logo_height_base + 45, 120, 30);
        salirButton.setBounds(290, logo_height_base + 45, 120, 30);
        perfilButton.setBounds(330, logo_height_base + 45, 120, 30);

    }

    public void addComponentsToContainer() {
        container.add(logoPanel);
        container.add(userLabel);

        container.add(reservarButton);
        container.add(historialButton);
        container.add(salirButton);
    }

    public void addActionEvent() {
        reservarButton.addActionListener(this);
        historialButton.addActionListener(this);
        salirButton.addActionListener(this);
    }

    private Respuesta validarCampos() {
        //Respuesta respuesta = validarCampo(userTextField);
        return null;
    }

    public Respuesta validarCampo(JTextField campo) {
        if (campo != null) {
            String text = campo.getText();
            if (text.isBlank()) {
                return new Respuesta(true, "es valido");
            } else {
                return new Respuesta(false, "El campo esta vacio");
            }
        }
        return new Respuesta(false, "No se ha podido obtener el campo: null");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salirButton) {
            new LoginFrame();
            this.dispose();
        }
        if (e.getSource() == reservarButton) {
            new ReservarFrame();
            this.dispose();
        }
        if (e.getSource() == historialButton) {
            new HistorialFrame();
            this.dispose();
        }
    }

}
