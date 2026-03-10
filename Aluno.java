package Academico;
import java.time.LocalDate;
import java.time.Period;


public class Aluno{
    private String nome;
    private LocalDate dataNascimento;

    // contrutor
    public Aluno(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
    // metodo Getters e Setters
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    public LocalDate getDataNascimento(){return dataNascimento;}
    public void setDataNascimetno (LocalDate dataNascimentono){this.dataNascimento = dataNascimentono;}

    // metodo para calcular a idade do aluno

    public int calcularIdade () {return Period.between(this.dataNascimento, LocalDate.now()).getYears();}
}