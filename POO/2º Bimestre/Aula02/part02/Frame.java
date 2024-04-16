import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{
    // Criando os componentes do formulário
    private Container container;
    private JLabel title;
    private JLabel name;
    private JTextField inputName;
    private JLabel cellphone;
    private TextField inputCellphone;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton others;
    private ButtonGroup genderGroup;
    private JLabel bornDate;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private Jlabel addComent;
    private JTextArea inputAddComent;
    private JLabel acceptTerms;
    private JCheckBox inputAcceptTerms;
    private Jbutton save;
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
        "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", 
        "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", 
        "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", 
        "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", 
        "2044", "2045", "2046", "2047", "2048", "2049", "2050"
    };

    @Override
    public void setTitle(String title) {
        // TODO auto-generated method stub
        super.setTitle("Formulário de Registro");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        container = getContainerPane();
        container = setLayout(null);

        // Posicionando cada elemento na tela
        title = new Jlabel("Formulário de Registro");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        container.add(title);

        name = new JLabel("Nome: ");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        container.add(name);
    }
}
