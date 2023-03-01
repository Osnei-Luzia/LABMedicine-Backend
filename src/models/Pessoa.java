package models;

import java.time.LocalDate;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
