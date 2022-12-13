import models.Pessoa;

class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Jonatas", 27);
        System.out.println("Nome: " + pessoa.verNome());
        System.out.println("Nome: " + pessoa.verIdade());
    }
}