package models;

import java.util.Calendar;

public class Pessoa {
    int id;
    String nome;
    String genero; //Masculino, Feminino, Outro
    Calendar nascimento;
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

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
