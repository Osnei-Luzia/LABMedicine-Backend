package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    int id;
    String nome;
    String genero; //Masculino, Feminino, Outro
    LocalDate nascimento;
    String cpf;
    String telefone;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = LocalDate.parse(nascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void relatorioPessoa() {
        System.out.println("-------------------");
        System.out.println("ID: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("");
    }
}
