package Academico;

import java.time.LocalDate;

public class Main{
  public static void main(String[]args){
        //Criando um Aluno
      Aluno aluno = new Aluno("Gabriel Luciano", LocalDate.of (2004,5,11));

      System.out.println("Nome: " + aluno.getNome());
      System.out.println("idade:" + aluno.calcularIdade() + "anos");
  }

}