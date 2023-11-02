package Ciclo03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");

        // Obtén el dispositivo gráfico predeterminado
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

        if (gd.isFullScreenSupported()) {
            // Si el modo de pantalla completa es compatible, establece la ventana en modo de pantalla completa
            setUndecorated(true); // Oculta las decoraciones de la ventana (barra de título, bordes)
            gd.setFullScreenWindow(this); // Establece esta ventana en modo de pantalla completa

            // Captura el evento ESC para salir del modo de pantalla completa
            KeyStroke escapeKeyStroke = KeyStroke.getKeyStroke("ESCAPE");
            Action escapeAction = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    gd.setFullScreenWindow(null); // Salir del modo de pantalla completa
                    dispose(); // Cierra la ventana
                }
            };
            getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(escapeKeyStroke, "ESCAPE");
            getRootPane().getActionMap().put("ESCAPE", escapeAction);
        } else {
            // Si el modo de pantalla completa no es compatible, establece un tamaño fijo para la ventana
            setSize(800, 600); // Cambia el tamaño a tus preferencias
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");

        Font font = new Font("Arial", Font.PLAIN, 28);

        usernameLabel.setFont(font);
        passwordLabel.setFont(font);

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(usernameLabel, constraints);

        usernameField = new JTextField(25);
        usernameField.setFont(font);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(usernameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(passwordLabel, constraints);

        passwordField = new JPasswordField(25);
        passwordField.setFont(font);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(passwordField, constraints);

        loginButton = new JButton("Login");
        loginButton.setFont(font);
        loginButton.addActionListener(this);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        panel.add(loginButton, constraints);

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            if (username.equals("valentino") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
            } else {
                JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm();
        });
    }
}
