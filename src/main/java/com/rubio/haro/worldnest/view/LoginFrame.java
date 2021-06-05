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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class LoginFrame extends JFrame implements ActionListener {

    Container container;
    JLabel userLabel;
    JLabel passwordLabel;

    JTextField userTextField;

    JPasswordField passwordField;

    JButton loginButton;
    JButton registroButton;
    JCheckBox showPassword;
    IsologoPanel logoPanel;

    public LoginFrame() {
        super("Iniciar Sesion");
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
        logoPanel = new IsologoPanel();

        userLabel = new JLabel("Usuario");
        passwordLabel = new JLabel("Password");

        userTextField = new JTextField();
        passwordField = new JPasswordField();

        loginButton = new JButton("Iniciar");
        loginButton.setBackground(Color.WHITE);
        registroButton = new JButton("Ir a registro");
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

        userLabel.setBounds(10, logo_height_base + 10, 100, 30);
        userTextField.setBounds(10, logo_height_base + 50, 150, 30);

        passwordLabel.setBounds(200, logo_height_base + 10, 100, 30);
        passwordField.setBounds(200, logo_height_base + 50, 150, 30);
        showPassword.setBounds(260, logo_height_base + 10, 80, 30);

        loginButton.setBounds(370, logo_height_base + 45, 100, 30);
        registroButton.setBounds(370, logo_height_base + 10, 100, 30);

    }

    public void addComponentsToContainer() {
        container.add(logoPanel);
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
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
        }
        return respuesta;
    }

    public Respuesta validarCampo(JTextField campo) {
        if (campo != null) {
            String text = campo.getText();
            if (!text.isBlank()) {
                return new Respuesta(true, "es valido");
            } else {
                return new Respuesta(false, "El campo esta vacio");
            }
        }
        return new Respuesta(false, "No se ha podido obtener el campo: null");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            Respuesta respuesta = validarCampos();
            if (respuesta.getEstado()) {
                String userText;
                String pwdText;
                userText = userTextField.getText();
                pwdText = passwordField.getText();
                if (userText.equalsIgnoreCase("roy") && pwdText.equalsIgnoreCase("123")) {
                    JOptionPane.showMessageDialog(this, "Login Successful");
                    new HomeFrame();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                }
            } else {
                JOptionPane.showMessageDialog(this, respuesta.getMensaje());
            }
        }
        if (e.getSource() == registroButton) {
            new RegistroFrame();
            this.dispose();
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
    }
}
