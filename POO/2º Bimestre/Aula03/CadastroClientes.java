import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroClientes extends JFrame {
    private JTextField nomeField, emailField;
    private JButton cadastroButton;

    public CadastroClientes() {
        // Crianção o títuto do formulário
        setTitle("Cadastro de Clientes");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação da área do formulário
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Colocando o conteúdo no formulário
        JLabel nomeLabel = new JLabel("Nome: ");
        JLabel emailLabel = new JLabel("Email: ");
        JButton cadastroButton = new JButton("Cadastrar");

        nomeField = new JTextField(); // Criando o input
        emailField = new JTextField();

        // Adicionando os componentes no painel
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(cadastroButton);

        // Adicionando o painel ao quadro pai, principal
        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroClientes().setVisible(true);
            }
        });
    }
}