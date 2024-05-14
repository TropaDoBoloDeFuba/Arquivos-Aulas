package parte01;
public class Animal {
    public void comer() {
        System.out.println("Animal comendo");
    }
}

class Cao extends Animal {
    public void comer() {
        System.out.println("Cão comendo...");
    }
}

class Tigre extends Animal {
    public void comer() {
        System.out.println("Tigre comendo...");
    }
}

class Gato extends Animal {
    public void comer() {
        System.out.println("Gato comendo...");
    }
}

class Teste {
    public void fazerAnimalComer(Animal animal) {
        animal.comer();
    }

    public static void main(String args[]) {
        Teste teste = new Teste();
        teste.fazerAnimalComer(new Animal());
        teste.fazerAnimalComer(new Cao());
        teste.fazerAnimalComer(new Tigre());
        teste.fazerAnimalComer(new Gato());
    }
}