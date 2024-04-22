import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal3 extends JFrame implements ActionListener {

    private Container container;
    private JLabel titulo;
    private JLabel nome;
    private JTextField tnome;
    private JLabel celular;
    private JTextField tcelular;
    private JLabel genero;
    private JRadioButton feminino;
    private JRadioButton masculino;
    private JRadioButton outros;
    private ButtonGroup gengp;
    private JLabel datnasc;
    private JComboBox<String> data;
    private JComboBox<String> mes;
    private JComboBox<String> ano;
    private JLabel adicionarComentario;
    private JTextArea tradicionarComentario;
    private JLabel aceitarTermos;
    private JCheckBox taceitarTermos;
    private JButton salvar;
    private JButton limpar;

    private String[] dates = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31" };

    private String[] meses = { "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul",
            "Ago", "Set", "Out", "Nov", "Dez" };

    private String[] anos = { "1995", "1996", "1997", "1998", "1999", "2000",
            "2001", "2002", "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010", "2011", "2012",
            "2013", "2014", "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022", "2023", "2024" };

    public Principal3() {
        super("Formulário de Registro");
        setSize(980, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        container = getContentPane();
        container.setLayout(null);

        titulo = new JLabel("Formulário de Registro");
        titulo.setFont(new Font("Arial", Font.PLAIN, 30));
        titulo.setBounds(300, 30, 400, 40);
        container.add(titulo);

        nome = new JLabel("Nome");
        nome.setFont(new Font("Arial", Font.PLAIN, 20));
        nome.setBounds(100, 100, 100, 20);
        container.add(nome);

        tnome = new JTextField();
        tnome.setBounds(220, 100, 200, 25);
        container.add(tnome);

        celular = new JLabel("Celular");
        celular.setFont(new Font("Arial", Font.PLAIN, 20));
        celular.setBounds(100, 150, 100, 20);
        container.add(celular);

        tcelular = new JTextField();
        tcelular.setBounds(220, 150, 200, 25);
        container.add(tcelular);

        genero = new JLabel("Gênero");
        genero.setFont(new Font("Arial", Font.PLAIN, 20));
        genero.setBounds(100, 200, 100, 20);
        container.add(genero);

        feminino = new JRadioButton("Feminino");
        feminino.setFont(new Font("Arial", Font.PLAIN, 15));
        feminino.setBounds(220, 200, 100, 20);
        container.add(feminino);

        masculino = new JRadioButton("Masculino");
        masculino.setFont(new Font("Arial", Font.PLAIN, 15));
        masculino.setBounds(320, 200, 100, 20);
        container.add(masculino);

        outros = new JRadioButton("Outros");
        outros.setFont(new Font("Arial", Font.PLAIN, 15));
        outros.setBounds(420, 200, 100, 20);
        container.add(outros);

        gengp = new ButtonGroup();
        gengp.add(feminino);
        gengp.add(masculino);
        gengp.add(outros);

        datnasc = new JLabel("Data de Nascimento");
        datnasc.setFont(new Font("Arial", Font.PLAIN, 20));
        datnasc.setBounds(100, 250, 200, 20);
        container.add(datnasc);

        data = new JComboBox<>(dates);
        data.setBounds(320, 250, 60, 25);
        container.add(data);

        mes = new JComboBox<>(meses);
        mes.setBounds(400, 250, 80, 25);
        container.add(mes);

        ano = new JComboBox<>(anos);
        ano.setBounds(500, 250, 80, 25);
        container.add(ano);

        adicionarComentario = new JLabel("Adicionar Comentário");
        adicionarComentario.setFont(new Font("Arial", Font.PLAIN, 20));
        adicionarComentario.setBounds(100, 300, 250, 20);
        container.add(adicionarComentario);

        tradicionarComentario = new JTextArea();
        tradicionarComentario.setFont(new Font("Arial", Font.PLAIN, 15));
        tradicionarComentario.setBounds(100, 330, 300, 100);
        tradicionarComentario.setLineWrap(true);
        container.add(tradicionarComentario);

        aceitarTermos = new JLabel("Aceitar Termos");
        aceitarTermos.setFont(new Font("Arial", Font.PLAIN, 20));
        aceitarTermos.setBounds(100, 450, 200, 20);
        container.add(aceitarTermos);

        taceitarTermos = new JCheckBox("Eu aceito os termos e condições");
        taceitarTermos.setFont(new Font("Arial", Font.PLAIN, 15));
        taceitarTermos.setBounds(320, 450, 300, 20);
        container.add(taceitarTermos);

        salvar = new JButton("Salvar");
        salvar.setFont(new Font("Arial", Font.PLAIN, 20));
        salvar.setBounds(150, 500, 120, 40);
        salvar.addActionListener(this);
        container.add(salvar);

        limpar = new JButton("Limpar");
        limpar.setFont(new Font("Arial", Font.PLAIN, 20));
        limpar.setBounds(300, 500, 120, 40);
        limpar.addActionListener(this);
        container.add(limpar);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salvar) {
            // Lógica para salvar os dados do formulário
            JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
        } else if (e.getSource() == limpar) {
            // Lógica para limpar os campos do formulário
            tnome.setText("");
            tcelular.setText("");
            tradicionarComentario.setText("");
            taceitarTermos.setSelected(false);
            gengp.clearSelection();
            data.setSelectedIndex(0);
            mes.setSelectedIndex(0);
            ano.setSelectedIndex(0);
        }
    }

    public static void main(String[] args) {
        new Principal3();
    }
}