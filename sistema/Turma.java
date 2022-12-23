package sistema;

public class Turma {
  public String nome;
  public Aluno[] alunos;

  public Turma(String nome) {
    this.nome = nome;
    this.alunos = new Aluno[5];
  }

  public int contarAlunos() {
    int total = 0;
    for (Aluno aluno : alunos) {
      if (aluno != null) {
        total++;
      }
    }
    return total;
  }

  public boolean adicionaAluno(Aluno aluno) {
    for (int i = 0; i < alunos.length; i++) {
      if (alunos[i] == null) {
        alunos[i] = aluno;
        return true;
      }
    }
    return false;
  }

  public boolean removeAluno(Aluno aluno) {
    for (int i = 0; i < alunos.length; i++) {
      if (alunos[i] == aluno) {
        alunos[i] = null;
        return true;
      }
    }
    return false;
  }
}
