package factoryanimal;

public class Main {

    public static void main(String[] args) {
        AnimalFactory fabrica = new AnimalFactory();
        Animal a = fabrica.criarAnimal();
        a.setNome("Tom");
        a.dizerOi();
    }
}
