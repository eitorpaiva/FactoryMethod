package factoryanimal;

public class Cachorro implements Animal {

    private String nome;

    @Override
    public void dizerOi() {
        System.out.println("Oi! Cachorro: " + nome);
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
}
