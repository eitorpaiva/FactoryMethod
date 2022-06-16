package factoryanimal;

public class Gato implements Animal {

    private String nome;

    @Override
    public void dizerOi() {
        System.out.println("Oi! Gato: " + nome);
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
