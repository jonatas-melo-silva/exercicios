package models;

public class Carro {
  private String placa;
  private String cor;
  private String modelo;
  private int qtdPortas;
  private boolean ligado;
  private float velocidadeMaxima;
  private float velocidadeAtual;

  public void acelerar(float umaQuantidade) {
    if (this.ligado) {
      this.velocidadeAtual = this.velocidadeAtual + umaQuantidade;
    }
  }

  public void frear(float umaQuantidade) {
    if (this.ligado) {
      this.velocidadeAtual = this.velocidadeAtual - umaQuantidade;
    }
  }

  public void ligar() {
    this.ligado = true;
  }

  public void desligar() {
    this.ligado = false;
  }

  public boolean estaLigado() {
    return true;
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
}