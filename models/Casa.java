package models;

public class Casa {
  private String cor;
  private Porta[] porta;

  public Casa() {
    this.cor = "branca";
    this.porta = new Porta[10];
  }

  public void pintar(String umaCor) {
    this.cor = umaCor;
  }

  public void adicionarPorta(Porta umaPorta) {
    for (int i = 0; i < porta.length; i++) {
      if (porta[i] == null) {
        porta[i] = umaPorta;
        break;
      }
    }
  }

  public int contarPortasAbertas() {
    int portasAbertas = 0;
    for (int i = 0; i < porta.length; i++) {
      if (porta[i] != null && porta[i].estaAberta()) {
        portasAbertas++;
      }
    }
    return portasAbertas;
  }

  public int contarPortasFechadas() {
    int portasFechadas = 0;
    for (int i = 0; i < porta.length; i++) {
      if (porta[i] != null && !porta[i].estaAberta()) {
        portasFechadas++;
      }
    }
    return portasFechadas;
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
  }
}