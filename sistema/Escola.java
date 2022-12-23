package sistema;

import java.util.HashSet;

public class Escola {
  private String nome;
  private HashSet<Turma> turmas;

  public Escola(String nome) {
    this.turmas = new HashSet<>();
    this.nome = nome + turmas.size();
  }

  public int contarTurmas() {
    return turmas.size();
  }

  public int contarAlunos() {
    int total = 0;
    for (Turma turma : turmas) {
      total += turma.contarAlunos();
    }
    return total;
  }

  public boolean adicionaTurma(Turma turma) {
    return turmas.add(turma);
  }

  public boolean matricularAluno(Aluno aluno) {
    for (Turma turma : turmas) {
      if (turma.contarAlunos() < 5) {
        return turma.adicionaAluno(aluno);
      }
    }
    Turma novaTurma = new Turma("Nova turma: " + turmas.size());
    novaTurma.adicionaAluno(aluno);
    return adicionaTurma(novaTurma);
  }

  public boolean desmatricularAluno(Aluno aluno) {
    for (Turma turma : turmas) {
      if (turma.removeAluno(aluno)) {
        if (turma.contarAlunos() == 0) {
          turmas.remove(turma);
          return true;
        }
      }
    }
    return false;
  }

  public String getNome() {
    return nome;
  }
}
