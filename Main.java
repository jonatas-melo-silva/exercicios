import models.*;


class Main {
    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa("Jonatas", 27);
        //System.out.println("Nome: " + pessoa.verNome());
        //System.out.println("Nome: " + pessoa.verIdade());

        Porta porta = new Porta("azul", 2.0f, 3.0f);

        System.out.println("Cor: " + porta.verCor());
        System.out.println("Está aberta: " + porta.estaAberta());

        porta.abrir();
        System.out.println("Está aberta: " + porta.estaAberta());
        porta.fechar();
        System.out.println("Está aberta: " + porta.estaAberta());
    }
}