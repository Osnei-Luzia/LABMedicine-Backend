package controller;

import dataAcessObject.Listas;
import models.Paciente;

import java.util.Scanner;

public class CadastroPaciente{

    public static void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        Listas banco = Listas.getInstance();
        Paciente paciente = new Paciente();

        //Pessoa
        System.out.println("Informe o nome - Obrigatório");
        paciente.setNome(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o gênero: Masculino, Feminino ou Outro - Obrigatório");
        paciente.setGenero(Validacoes.campoObrigatorio(Validacoes.isGeneroValido(scanner.nextLine())));
        System.out.println("Informe a data de nascimento. 00/00/0000 - Obrigatório");
        paciente.setNascimento(Validacoes.isDataValida(scanner.nextLine()));
        System.out.println("Informe o CPF - Obrigatório");
        paciente.setCpf(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o Telefone - Obrigatório");
        paciente.setTelefone(Validacoes.campoObrigatorio(scanner.nextLine()));

        //Paciente
        System.out.println("Informe o contato de emergência - Obrigatório");
        paciente.setContato(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe uma alergia");
        paciente.setAlergias(Validacoes.repetirCampo(scanner.nextLine()));
        System.out.println("Informe um cuidado específico");
        paciente.setCuidados(Validacoes.repetirCampo(scanner.nextLine()));
        System.out.println("Informe o convênio");
        paciente.setConvenio(scanner.nextLine());
        if(!paciente.getConvenio().equals("")){
            System.out.println("Informe o número do convênio");
            paciente.setNumeroConvenio(scanner.nextLine());
            System.out.println("Informe a data de vencimento do convênio");
            paciente.setValidadeConvenio(Validacoes.isDataValida(scanner.nextLine()));
        }
        //paciente.setStatus();
        banco.addPaciente(paciente);
        try {
            System.out.println("");
            System.out.println("Cadastro realizado com Sucesso.");
            System.out.println("Enter para continuar");
            System.out.println("");
            System.in.read();
            view.SubMenu.cadastro();
        }catch(Exception e){

        }
    }
}