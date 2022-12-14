package models;

public class Porta {
    private String cor;
    private float altura;
    private float largura;
    private boolean aberta;

    public Porta(float umaAltura, float umaLargura) {
        this.altura = umaAltura;
        this.largura = umaLargura;
    }

    public Porta(String umaCor, float umaAltura, float umaLargura) {
        this.cor = umaCor;
        this.altura = umaAltura;
        this.largura = umaLargura;
    }

    public void abrir() {
        this.aberta = true;
    }

    public void fechar() {
        this.aberta = false;
    }

    public boolean estaAberta() {
        if (this.aberta) return true;
        return false;
    }

    public String verCor() {
        return this.cor;
    }

    public void pintar(String umaCor) {
        this.cor = umaCor;
    }

    public static void main(String[] args) {
        Porta porta = new Porta("azul", 2.0f, 3.0f);

        System.out.println("Cor: " + porta.verCor());
        System.out.println("Está aberta: " + porta.estaAberta());

        porta.abrir();
        System.out.println("Está aberta: " + porta.estaAberta());
        porta.fechar();
        System.out.println("Está aberta: " + porta.estaAberta());
    }
}