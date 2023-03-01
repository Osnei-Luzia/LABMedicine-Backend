package controller;

import dataAcessObject.Listas;
import models.Medico;
import models.Paciente;

import java.util.Scanner;

public class CadastroMedico {
    public static void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        Listas banco = Listas.getInstance();
        Medico medico = new Medico();
        String resposta;

        //Pessoa
        System.out.println("Informe o nome");
        medico.setNome(scanner.nextLine());
        System.out.println("Informe o gênero: Masculino, Feminino ou Outro");
        medico.setGenero(scanner.nextLine());
        System.out.println("Informe a data de nascimento. 00/00/0000");
        //isNascimentoValido(scanner.nextLine());
        System.out.println("Informe o CPF");
        medico.setCpf(scanner.nextLine());
        System.out.println("Informe o Telefone");
        medico.setTelefone(scanner.nextLine());

        //Medico
        System.out.println("Informe a Instituição de Ensino da Formação");
        medico.setInstituicao(scanner.nextLine());
        System.out.println("Informe o CRM");
        medico.setCrm(scanner.nextLine());
        System.out.println("Informe a especialização");
        medico.setEspecializacao(scanner.nextLine());
        //medico.setStatus();
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
