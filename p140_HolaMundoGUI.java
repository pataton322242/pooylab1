import javax.swing.*;
import java.awt.*;

public class p140_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;

    public p140_HolaMundoGUI() {
        setLayout(null);
        lblSaludo = new JLabel("Te quiero niña <3");
        lblSaludo.setFont(new Font("Times New Roman ", Font.BOLD, 20));
        lblSaludo.setBounds(10, 20, 200, 30);
        add(lblSaludo);
    }

    public static void main(String[] args) {
        p140_HolaMundoGUI app = new p140_HolaMundoGUI();
        app.setBounds(10, 10, 400, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}