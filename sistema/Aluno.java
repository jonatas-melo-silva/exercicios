package sistema;

public class Aluno {
  private String nome;
  private String matricula;
  private int idade;

  public Aluno(String nome, String matricula, int idade) {
    this.nome = nome;
    this.matricula = matricula;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public int getIdade() {
    return idade;
  }
}
