import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener {
    // Criando os componentes do formulário
    private Container container;
    private JLabel title;
    private JLabel name;
    private JTextField inputName;
    private JLabel cellphone;
    private JTextField inputCellphone;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton others;
    private ButtonGroup genderGroup;
    private JLabel bornDate;
    private JComboBox<String> date;
    private JComboBox<String> month;
    private JComboBox<String> year;
    private JLabel addComment;
    private JTextArea inputAddComment;
    private JLabel acceptTerms;
    private JCheckBox inputAcceptTerms;
    private JButton save;
    private JButton clear;

    // Criando o array para dia, mês e ano
    private String days[] = {
            "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31"
    };

    private String months[] = {
            "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul",
            "Ago", "Set", "Out", "Nov", "Dez"
    };

    private String years[] = {
            "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992",
            "1993", "1994", "1995",
            "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008",
            "2009", "2010", "2011",
            "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024",
            "2025", "2026", "2027",
            "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040",
            "2041", "2042", "2043",
            "2044", "2045", "2046", "2047", "2048", "2049", "2050"
    };

    public Frame() {
        setTitle("Formulário de Registro");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        // Posicionando cada elemento na tela
        title = new JLabel("Formulário de Registro");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        container.add(title);

        name = new JLabel("Nome: ");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        container.add(name);

        inputName = new JTextField();
        inputName.setFont(new Font("Arial", Font.PLAIN, 15));
        inputName.setSize(190, 20);
        inputName.setLocation(200, 100);
        container.add(inputName);

        cellphone = new JLabel("Celular: ");
        cellphone.setFont(new Font("Arial", Font.PLAIN, 20));
        cellphone.setSize(100, 20);
        cellphone.setLocation(100, 150);
        container.add(cellphone);

        inputCellphone = new JTextField();
        inputCellphone.setFont(new Font("Arial", Font.PLAIN, 15));
        inputCellphone.setSize(150, 20);
        inputCellphone.setLocation(200, 150);
        container.add(inputCellphone);

        // Adicionando os radio buttons para gênero
        gender = new JLabel("Gênero: ");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        container.add(gender);

        male = new JRadioButton("Masculino");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(100, 20);
        male.setLocation(200, 200);
        container.add(male);

        female = new JRadioButton("Feminino");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(100, 20);
        female.setLocation(300, 200);
        container.add(female);

        others = new JRadioButton("Outros");
        others.setFont(new Font("Arial", Font.PLAIN, 15));
        others.setSelected(false);
        others.setSize(100, 20);
        others.setLocation(400, 200);
        container.add(others);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(others);

        // Adicionando seleção de data de nascimento
        bornDate = new JLabel("Data de Nascimento: ");
        bornDate.setFont(new Font("Arial", Font.PLAIN, 20));
        bornDate.setSize(200, 20);
        bornDate.setLocation(100, 250);
        container.add(bornDate);

        date = new JComboBox<>(days);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(300, 250);
        container.add(date);

        month = new JComboBox<>(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(360, 250);
        container.add(month);

        year = new JComboBox<>(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(70, 20);
        year.setLocation(430, 250);
        container.add(year);

        // Adicionando campo para comentários adicionais
        addComment = new JLabel("Comentário Adicional: ");
        addComment.setFont(new Font("Arial", Font.PLAIN, 20));
        addComment.setSize(200, 20);
        addComment.setLocation(100, 300);
        container.add(addComment);

        inputAddComment = new JTextArea();
        inputAddComment.setFont(new Font("Arial", Font.PLAIN, 15));
        inputAddComment.setSize(300, 75);
        inputAddComment.setLocation(300, 300);
        inputAddComment.setLineWrap(true);
        container.add(inputAddComment);

        // Adicionando opção para aceitar termos
        acceptTerms = new JLabel("Aceitar Termos: ");
        acceptTerms.setFont(new Font("Arial", Font.PLAIN, 20));
        acceptTerms.setSize(200, 20);
        acceptTerms.setLocation(100, 400);
        container.add(acceptTerms);

        inputAcceptTerms = new JCheckBox();
        inputAcceptTerms.setFont(new Font("Arial", Font.PLAIN, 15));
        inputAcceptTerms.setSize(25, 25);
        inputAcceptTerms.setLocation(300, 400);
        container.add(inputAcceptTerms);

        // Adicionando botões de salvar e limpar
        save = new JButton("Salvar");
        save.setFont(new Font("Arial", Font.PLAIN, 15));
        save.setSize(100, 30);
        save.setLocation(200, 450);
        save.addActionListener(this);
        container.add(save);

        clear = new JButton("Limpar");
        clear.setFont(new Font("Arial", Font.PLAIN, 15));
        clear.setSize(100, 30);
        clear.setLocation(350, 450);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            // Lógica para salvar os dados do formulário
            String nome = inputName.getText();
            String celular = inputCellphone.getText();
            String genero = "";
            if (male.isSelected()) {
                genero = "Masculino";
            } else if (female.isSelected()) {
                genero = "Feminino";
            } else if (others.isSelected()) {
                genero = "Outros";
            }
            String dataNascimento = (String) date.getSelectedItem() + "/" + (String) month.getSelectedItem() + "/"
                    + (String) year.getSelectedItem();
            String comentario = inputAddComment.getText();
            boolean aceitarTermos = inputAcceptTerms.isSelected();

            // Aqui você pode implementar a lógica para salvar os dados em algum lugar
            // Por exemplo, você pode exibir uma mensagem de confirmação
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");

            // Limpar campos após salvar
            inputName.setText("");
            inputCellphone.setText("");
            male.setSelected(true);
            inputAddComment.setText("");
            inputAcceptTerms.setSelected(false);
        } else if (e.getSource() == clear) {
            // Lógica para limpar os campos do formulário
            inputName.setText("");
            inputCellphone.setText("");
            male.setSelected(true);
            inputAddComment.setText("");
            inputAcceptTerms.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Frame();
    }

}
