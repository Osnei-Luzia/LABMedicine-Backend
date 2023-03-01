package controller;

import dataAcessObject.Listas;
import models.Enfermeiro;
import models.Medico;

import java.util.Scanner;

public class CadastroEnfermeiro {
    public static void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        Listas banco = Listas.getInstance();
        Enfermeiro enfermeiro = new Enfermeiro();
        String resposta;

        //Pessoa
        System.out.println("Informe o nome");
        enfermeiro.setNome(scanner.nextLine());
        System.out.println("Informe o gênero: Masculino, Feminino ou Outro");
        enfermeiro.setGenero(scanner.nextLine());
        System.out.println("Informe a data de nascimento. 00/00/0000");
        //isNascimentoValido(scanner.nextLine());
        System.out.println("Informe o CPF");
        enfermeiro.setCpf(scanner.nextLine());
        System.out.println("Informe o Telefone");
        enfermeiro.setTelefone(scanner.nextLine());

        //Enfermeiro
        System.out.println("Informe a Instituição de Ensino da Formação");
        enfermeiro.setInstituicao(scanner.nextLine());
        System.out.println("Informe o COFEN/UF");
        enfermeiro.setCofen(scanner.nextLine());
        banco.addEnfermeiro(enfermeiro);
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
