import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        // Definir o tema para melhorar a aparência
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Cria a janela principal
        JFrame frame = new JFrame("Cadastro de Usuários");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Centralizar a janela

        // Cria o painel principal com um layout elegante
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adicionar margens

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre componentes

        // Adiciona campos de texto e rótulos ao painel
        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Nome:"), gbc);

        gbc.gridx = 1;
        JTextField nomeField = new JTextField(20);
        panel.add(nomeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Email:"), gbc);

        gbc.gridx = 1;
        JTextField emailField = new JTextField(20);
        panel.add(emailField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Telefone:"), gbc);

        gbc.gridx = 1;
        JTextField telefoneField = new JTextField(20);
        panel.add(telefoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(new JLabel("Renda:"), gbc);

        gbc.gridx = 1;
        JTextField rendaField = new JTextField(20);
        panel.add(rendaField, gbc);

        // Adiciona um botão de envio ao painel
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton submitButton = new JButton("Cadastrar");
        submitButton.setPreferredSize(new Dimension(120, 30));
        panel.add(submitButton, gbc);

        // Adiciona o painel à janela
        frame.getContentPane().add(panel);

        // Define a ação do botão de envio
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = nomeField.getText();
                    String email = emailField.getText();
                    String telefone = telefoneField.getText();
                    double renda = Double.parseDouble(rendaField.getText());

                    ClientesDAO clienteDAO = new ClientesDAO();
                    clienteDAO.cadastrarCliente(nome, email, telefone, renda);

                    JOptionPane.showMessageDialog(frame, "Cliente cadastrado com sucesso!");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, insira uma renda válida.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Torna a janela visível
        frame.setVisible(true);
    }
}
