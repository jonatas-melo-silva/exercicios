package models;

public class Carro {
  private String placa;
  private String cor;
  private String modelo;
  private int qtdPortas;
  private boolean ligado;
  private float velocidadeMaxima;
  private float velocidadeAtual;

  public Carro(String umaPlaca, String umaCor, String umModelo, int umaQtdPortas) {
    this.placa = umaPlaca;
    this.cor = umaCor;
    this.modelo = umModelo;
    this.ligado = false;
    this.velocidadeMaxima = 120;
    this.velocidadeAtual = 0;

    if (qtdPortas >= 2) {
      this.qtdPortas = umaQtdPortas;
    } else {
      this.qtdPortas = 2;
    }
  }

  public Carro(String umaPlaca, String umaCor, String umModelo, int umaQtdPortas, float velocidadeMaxima) {
    this.placa = umaPlaca;
    this.cor = umaCor;
    this.modelo = umModelo;
    if (velocidadeMaxima > 0) {
      this.velocidadeMaxima = velocidadeMaxima;
    } else {
      this.velocidadeMaxima = 120;
    }
    this.velocidadeMaxima = velocidadeMaxima;
    if (qtdPortas >= 2) {
      this.qtdPortas = umaQtdPortas;
    } else {
      this.qtdPortas = 2;
    }
  }

  public void acelerar(float umaQuantidade) {
    float aceleracao = this.velocidadeAtual + umaQuantidade;
    if (estaLigado()) {
      if (aceleracao > this.velocidadeMaxima) {
        this.velocidadeAtual = this.velocidadeMaxima;
      } else {
        this.velocidadeAtual = aceleracao;
      }
    }
  }

  public void frear(float umaQuantidade) {
    float reducao = this.velocidadeAtual - umaQuantidade;
    if (estaLigado()) {
      if (reducao < 0) {
        this.velocidadeAtual = 0;
      } else {
        this.velocidadeAtual = reducao;
      }
    }
  }

  public void ligar() {
    this.ligado = true;
  }

  public void desligar() {
    if (this.velocidadeAtual == 0) {
      this.ligado = false;
    }
  }

  public boolean estaLigado() {
    return this.ligado;
  }

  public int getQtdPortas() {
    return this.qtdPortas;
  }

  public String getModelo() {
    return this.modelo;
  }

  public String verPlaca() {
    return this.placa;
  }

  public String verCor() {
    return this.cor;
  }

  public float verVelocidadeMaxima() {
    return this.velocidadeMaxima;
  }

  public float verVelocidadeAtual() {
    return this.velocidadeAtual;
  }

  public static void main(String[] args) {
    Carro carro = new Carro(
      "ABC-1234",
      "Preto",
      "Fusca",
      1,
      120
    );

    System.out.println("Está ligado: " + carro.estaLigado());
    System.out.println("Velocidade atual: " + carro.verVelocidadeAtual());
    carro.acelerar(20.0f);
    System.out.println("Velocidade atual: " + carro.verVelocidadeAtual());
    carro.ligar();
    carro.acelerar(20.0f);
    System.out.println("Velocidade atual: " + carro.verVelocidadeAtual());
    System.out.println("Velocidade máxima: " + carro.verVelocidadeMaxima());
    carro.acelerar(130.0f);
    System.out.println("Velocidade atual: " + carro.verVelocidadeAtual());
    carro.frear(100.0f);
    System.out.println("Velocidade atual: " + carro.verVelocidadeAtual());
    carro.desligar();
    System.out.println("Está ligado: " + carro.estaLigado());
    System.out.println("Quantide de portas: " + carro.getQtdPortas());
  }
}