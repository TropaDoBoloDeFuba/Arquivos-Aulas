public class ex02 {
    public class POO1 {
        int Calcula ()
        { return 1; };
    }
    public class P002 extends POO1 {
        int Calcula ()
        { return super.Calcula()+1; }
    }
    public class PO03 extends POO2 {
        int Calcula ()
        { return super.Calcula()+1; }
    }

    public static void main(String[] args) {
        int result = 0;
        POO1 Objs[] = new POO1[3];

        Objs[0]=new POO1();
        Objs[1]=new POO2();
        Objs[2]=new POO3();

        for(int i=0; i<3; i++) {
            result += Objs[i].Calcula();
        }

        System.out.println(result);
    }
}