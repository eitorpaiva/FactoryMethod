package factoryanimal;

public class AnimalFactory {

    public Animal criarAnimal() {
        if (Math.random() <= 0.5) {
            return new Gato();
        } else {
            return new Cachorro();
        }
    }
}
