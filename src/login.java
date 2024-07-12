import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login
{
    public JPanel mainPanel;
    private JTextField textField1;
    private JPasswordField CONTRASEÑAPasswordField;
    public JButton INGRESAR;
    public JLabel USUARIO;
    public JLabel CONTRASENIA;

    public login()
    {
        INGRESAR.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String usuario = textField1.getText();
                String contrasenia = new String(CONTRASEÑAPasswordField.getPassword());
                if (usuario.equals("kevin") && contrasenia.equals("mendoza"))
                {
                    JFrame frame = new JFrame("Solo personal autorizado");
                    frame.setContentPane(new RegistrarPro().mainPanel2);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                    JFrame login_frame = (JFrame) SwingUtilities.getWindowAncestor(mainPanel);
                    login_frame.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                }
            }
        });
    }
}

