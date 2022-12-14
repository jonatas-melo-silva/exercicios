package models;

public class Automovel {
  private Porta[] portas;
  private String cor;
  private int peneus;
  private int bancos;

  public Automovel() {
    this.portas = new Porta[4];
    this.cor = "branca";
    this.peneus = 4;
    this.bancos = 5;
  }

  public Automovel(int portas, String umaCor, int peneus, int bancos) {
    this.portas = new Porta[portas];
    this.cor = umaCor;
    this.peneus = peneus;
    this.bancos = bancos;
  }

  public void pintar(String umaCor) {
    this.cor = umaCor;
  }

  public String verCor() {
    return this.cor;
  }

  public int quantidadeDePeneus() {
    return this.peneus;
  }

  public int quantidadeDeBancos() {
    return this.bancos;
  }

  public static void main(String[] args) {
    Automovel automovel = new Automovel();

    System.out.println("Cor :" + automovel.verCor());
    System.out.println("Penues :" + automovel.quantidadeDePeneus());
    System.out.println("Bancos :" + automovel.quantidadeDeBancos());

    Automovel automovel2 = new Automovel(
        5, "vermelho", 6, 2);

    System.out.println("Cor :" + automovel2.verCor());
    System.out.println("Penues :" + automovel2.quantidadeDePeneus());
    System.out.println("Bancos :" + automovel2.quantidadeDeBancos());

    Automovel automovel3 = new Automovel(4, "preto", 4, 5);
    System.out.println("Cor :" + automovel3.verCor());
    System.out.println("Penues :" + automovel3.quantidadeDePeneus());
    System.out.println("Bancos :" + automovel3.quantidadeDeBancos());
  }
}