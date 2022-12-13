package models;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String umNome, int umaIdade) {
        this.nome = umNome;
        this.idade = umaIdade;
    }

    public void fazAniverssario() {}

    public int verIdade() { return this.idade; }

    public String verNome() { return this.nome; }
}