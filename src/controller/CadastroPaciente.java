package controller;

import dataAcessObject.Listas;
import models.Paciente;

import java.util.Scanner;

public class CadastroPaciente implements Validacoes{

    public static void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        Listas banco = Listas.getInstance();
        Paciente paciente = new Paciente();
        String resposta = "Sim";

        //Pessoa
        System.out.println("Informe o nome");
        paciente.setNome(scanner.nextLine());
        System.out.println("Informe o gênero: Masculino, Feminino ou Outro");
        paciente.setGenero(scanner.nextLine());
        System.out.println("Informe a data de nascimento. 00/00/0000");
        //isNascimentoValido(scanner.nextLine());
        System.out.println("Informe o CPF");
        paciente.setCpf(scanner.nextLine());
        System.out.println("Informe o Telefone");
        paciente.setTelefone(scanner.nextLine());

        //Paciente
        System.out.println("Informe o contato de emergência");
        paciente.setContato(scanner.nextLine());
        //while(resposta!="N"||resposta!="n"||resposta!="Não"||resposta!="Nao"||resposta!="não"||resposta!="nao"){
        System.out.println("Informe uma alergia");
        paciente.setAlergias(scanner.nextLine());
        //System.out.println("Deseja informar outra alergia? s/n");
        System.out.println("Informe um cuidado específico");
        paciente.setCuidados(scanner.nextLine());
        //System.out.println("Deseja informar outro cuidado? s/n");
        System.out.println("Informe o convênio");
        paciente.setConvenio(scanner.nextLine());
        System.out.println("Informe o número do convênio");
        paciente.setNumeroConvenio(scanner.nextLine());
        System.out.println("Informe a data de vencimento do convênio");
        //isDataValida
        paciente.setValidadeConvenio(scanner.nextLine());
        //paciente.setStatus();
        banco.addPaciente(paciente);
    }
}