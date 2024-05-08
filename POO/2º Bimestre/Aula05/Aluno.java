public class Aluno {
    private String nome;
    private String turma;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
        
    public Aluno(String nome, String turma, double nota1, double nota2, double nota3, double nota4){
        this.nome = nome;
        this.turma = turma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    public int somarNota(int a, int b, int x, int y){
        return a+b+x+y;
    }
    public double somarNota(double a, double b, double x, double y){
        return a+b+x+y;
    }
    public double calcMedia(double a, double b, double x, double y){
        return (a+b+x+y)/4;
    }
    public int calcMedia(int a, int b, int x, int y){
        return (a+b+x+y)/4;
    }
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "1A", 1,1,1,1);
        Aluno aluno2 = new Aluno("Pedro", "1A", 1.1,1.1,1.1,1.1);   
        System.out.println(aluno1.somarNota(aluno1.nota1, aluno1.nota2, aluno1.nota3, aluno1.nota4));
        System.out.println(aluno2.somarNota(aluno2.nota1, aluno2.nota2, aluno2.nota3, aluno2.nota4));
        System.out.println(aluno1.calcMedia(aluno1.nota1, aluno1.nota2, aluno1.nota3, aluno1.nota4));
        System.out.println(aluno2.calcMedia(aluno1.nota1, aluno1.nota2, aluno1.nota3, aluno1.nota4));
    }
    }