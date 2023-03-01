package controller;

import dataAcessObject.Listas;
import models.Medico;

import java.util.Scanner;

public class CadastroMedico {
    public static void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        Listas banco = Listas.getInstance();
        Medico medico = new Medico();

        //Pessoa
        System.out.println("Informe o nome - Obrigatório");
        medico.setNome(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o gênero: Masculino, Feminino ou Outro - Obrigatório");
        medico.setGenero(Validacoes.campoObrigatorio(Validacoes.isGeneroValido(scanner.nextLine())));
        System.out.println("Informe a data de nascimento. 00/00/0000 - Obrigatório");
        medico.setNascimento(Validacoes.isDataValida(Validacoes.campoObrigatorio(scanner.nextLine())));
        System.out.println("Informe o CPF - Obrigatório");
        medico.setCpf(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o Telefone - Obrigatório");
        medico.setTelefone(Validacoes.campoObrigatorio(scanner.nextLine()));

        //Medico
        System.out.println("Informe a Instituição de Ensino da Formação");
        medico.setInstituicao(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o CRM");
        medico.setCrm(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe a especialização");
        medico.setEspecializacao(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("O médico está Ativo ou Inativo?");
        medico.setStatus(Validacoes.campoObrigatorio(Validacoes.isStatusValido(scanner.nextLine())));
        banco.addMedico(medico);
        try {
            System.out.println("");
            System.out.println("Cadastro realizado com Sucesso.");
            System.out.println("Enter para continuar");
            System.out.println("");
            System.in.read();
        }catch(Exception e){

        }
    }
}
