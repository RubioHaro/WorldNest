package com.rubio.haro.worldnest.view;

import com.rubio.haro.worldnest.Respuesta;
import com.rubio.haro.worldnest.dao.EntidadArrendatario;
import com.rubio.haro.worldnest.dao.EntidadArrendatarioDAO;
import com.rubio.haro.worldnest.model.Arrendatario;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class RegistroFrame extends JFrame implements ActionListener {

    Container container;
    JLabel correoLabel;
    JLabel nombreLabel;
    JLabel telefonoLabel;
    JLabel direccionLabel;
    JLabel passwordLabel;

    JTextField userTextField;
    JTextField telefonoTextField;
    JTextField direccionTextField;
    JTextField nombreTextField;
    JPasswordField passwordField;

    JButton loginButton;
    JButton registroButton;
    JCheckBox showPassword;
    IsologoPanel logoPanel;

    public RegistroFrame() {
        super("Registro");
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    private void initComponents() {

        this.setBounds(10, 10, 500, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        Color primaryColor = new Color(255, 87, 87);
        container = getContentPane();
        container.setBackground(primaryColor);
        setLayoutManager();
        logoPanel = new IsologoArrendatario();

        correoLabel = new JLabel("Correo Electronico");
        nombreLabel = new JLabel("Nombre");
        telefonoLabel = new JLabel("# Telefonico");
        direccionLabel = new JLabel("Direccion");

        passwordLabel = new JLabel("Password");

        userTextField = new JTextField("Roy");
        userTextField.setName("Usuario");
        nombreTextField = new JTextField("Rodrigo");
        userTextField.setName("Nombre");
        passwordField = new JPasswordField("123");
        userTextField.setName("Password");
        telefonoTextField = new JTextField("5520477");
        userTextField.setName("Telefono");
        direccionTextField = new JTextField("Arica 48");
        userTextField.setName("Direccion");

        loginButton = new JButton("Ir a Login");
        loginButton.setBackground(Color.WHITE);
        registroButton = new JButton("Registrar");
        registroButton.setBackground(Color.WHITE);

        showPassword = new JCheckBox("mostrar");
        showPassword.setBackground(primaryColor);

        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
        this.setVisible(true);
    }

    public void setLocationAndSize() {
        int logo_height_base = 500;
        logoPanel.setBounds(0, 0, logo_height_base, 500);

        nombreLabel.setBounds(10, logo_height_base + 10, 100, 30);
        nombreTextField.setBounds(10, logo_height_base + 40, 150, 30);

        passwordLabel.setBounds(200, logo_height_base + 10, 100, 30);
        passwordField.setBounds(200, logo_height_base + 40, 150, 30);
        showPassword.setBounds(260, logo_height_base + 10, 80, 30);

        correoLabel.setBounds(10, logo_height_base + 10 + 80, 120, 30);
        userTextField.setBounds(10, logo_height_base + 40 + 80, 150, 30);

        telefonoLabel.setBounds(200, logo_height_base + 10 + 80, 120, 30);
        telefonoTextField.setBounds(200, logo_height_base + 40 + 80, 150, 30);

        direccionLabel.setBounds(10, logo_height_base + 10 + 80 * 2, 120, 30);
        direccionTextField.setBounds(10, logo_height_base + 40 + 80 * 2, 150 * 2 + 40, 30);

        loginButton.setBounds(370, logo_height_base + 10, 100, 100);
        registroButton.setBounds(370, logo_height_base + 130, 100, 100);

    }

    public void addComponentsToContainer() {
        container.add(logoPanel);

        container.add(correoLabel);
        container.add(nombreLabel);
        container.add(passwordLabel);
        container.add(telefonoLabel);
        container.add(direccionLabel);

        container.add(userTextField);
        container.add(telefonoTextField);
        container.add(direccionTextField);
        container.add(nombreTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(registroButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        registroButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    private Respuesta validarCampos() {
        Respuesta respuesta = validarCampo(userTextField);
        if (respuesta.getEstado()) {
            respuesta = validarCampo(passwordField);
            if (respuesta.getEstado()) {
                respuesta = validarCampo(telefonoTextField);
                if (respuesta.getEstado()) {
                    respuesta = validarCampo(direccionTextField);
                    if (respuesta.getEstado()) {
                        respuesta = validarCampo(nombreTextField);
                    }
                }
            }
        }
        return respuesta;
    }

    public Respuesta validarCampo(JTextField campo) {
        if (campo != null) {
            String text = campo.getText();
            if (!text.isEmpty()) {
                return new Respuesta(true, "es valido");
            } else {
                return new Respuesta(false, "El campo " + campo.getName() + "  esta vacio");
            }
        }
        return new Respuesta(false, "No se ha podido obtener el campo: null");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == registroButton) {
            Respuesta respuesta = validarCampos();
            if (respuesta.getEstado()) {
                try {
                    EntidadArrendatarioDAO eDao = new EntidadArrendatarioDAO();

                    Arrendatario arrendatario = new Arrendatario(nombreTextField.getText(), direccionTextField.getText(), telefonoTextField.getText());
                    arrendatario.setPassword(passwordField.getPassword());
                    EntidadArrendatario entity = new EntidadArrendatario(arrendatario);
                    eDao.create(entity);
                    new LoginArrendatarioFrame();
                    this.dispose();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, respuesta.getMensaje());
            }
        }
        //Coding Part of RESET button
        if (e.getSource() == loginButton) {
            new LoginArrendatarioFrame();
            this.dispose();
        }
        //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
}
