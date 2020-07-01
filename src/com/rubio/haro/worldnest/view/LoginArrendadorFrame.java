package com.rubio.haro.worldnest.view;

import com.rubio.haro.worldnest.Respuesta;
import com.rubio.haro.worldnest.dao.EntidadArrendador;
import com.rubio.haro.worldnest.dao.EntidadArrendadorDAO;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Rubio Haro Rodrigo R.
 */
public class LoginArrendadorFrame extends LoginFrame {

    public LoginArrendadorFrame() {
        super("Iniciar Sesion como Arrendador", new IsologoArrendador());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            Respuesta respuesta = this.validarCampos();
            if (respuesta.getEstado()) {
                String userText;
                String pwdText;
                userText = userTextField.getText();
                pwdText = passwordField.getText();

                EntidadArrendadorDAO eDAO = new EntidadArrendadorDAO();
                EntidadArrendador entity = new EntidadArrendador();
                entity.setEnombre(userText);
                System.out.println(entity);
                entity = eDAO.read(entity);
                System.out.println(entity);

                if (entity.login(pwdText)) {
                    entity.getArrendador();
                    new HomeArrendadorFrame();
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario o constraseña son erroneos, verificalos");
                }
            } else {
                JOptionPane.showMessageDialog(this, respuesta.getMensaje());
            }
        }
        if (e.getSource() == registroButton) {
            new RegistroArrendadorFrame();
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
