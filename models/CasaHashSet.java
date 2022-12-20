package models;

import java.util.HashSet;

public class CasaHashSet {
  private String cor;
  private HashSet<Porta> portas;

  public CasaHashSet() {
    this.cor = "branca";
    this.portas = new HashSet<>();
  }

  public void adicionarPorta(Porta umaPorta) {
    this.portas.add(umaPorta);
  }

  public int contarPortasAbertas() {
    int portasAbertas = 0;
    for (Porta porta : portas) {
      if (porta.estaAberta()) {
        portasAbertas++;
      }
    }
    return portasAbertas;
  }

  public int contarPortasFechadas() {
    int portasFechadas = 0;
    for (Porta porta : portas) {
      if (!porta.estaAberta()) {
        portasFechadas++;
      }
    }
    return portasFechadas;
  }

  public String getCor() {
    return this.cor;
  }

  public void pintar(String umaCor) {
    this.cor = umaCor;
  }

  public static void main(String[] args) {
    Casa casa = new Casa();

    casa.pintar("azul");

    Porta porta1 = new Porta("azul", 2.0f, 3.0f);
    porta1.abrir();
    Porta porta2 = new Porta("verde", 2.0f, 3.0f);
    porta2.abrir();
    Porta porta3 = new Porta("vermelha", 2.0f, 3.0f);
    porta3.abrir();

    casa.adicionarPorta(porta1);
    casa.adicionarPorta(porta2);
    casa.adicionarPorta(porta3);

    porta3.fechar();
    porta3.abrir();

    System.out.println("Portas abertas: " + casa.contarPortasAbertas());
    System.out.println("Portas fechadas: " + casa.contarPortasFechadas());

    porta3.fechar();

    System.out.println("Portas fechadas: " + casa.contarPortasFechadas());
  }
}