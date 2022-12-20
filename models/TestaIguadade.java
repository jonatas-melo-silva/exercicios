package models;

public class TestaIguadade {
  public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa("jonatas", 27);
    Pessoa pessoa2 = new Pessoa("jonatas", 27);

    System.out.println(pessoa1 == pessoa2);
    System.out.println(pessoa1);
    System.out.println(pessoa2);

    Pessoa pessoa3 = pessoa1;

    System.out.println(pessoa3);

    System.out.println(pessoa1.equals(pessoa3));
    System.out.println(pessoa1.equals(pessoa2));

    pessoa3 = pessoa2;

    System.out.println(pessoa3);
    System.out.println(pessoa2);
    System.out.println(pessoa3 == pessoa2);

    System.out.println(pessoa3.equals(pessoa1));
  }
}
