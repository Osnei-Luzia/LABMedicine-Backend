package controller.cadastros;

import dataAcessObject.Listas;
import models.Enfermeiro;

import java.util.Scanner;

public class CadastroEnfermeiro {
    public static void cadastrar(){
        Scanner scanner = new Scanner(System.in);
        Listas banco = Listas.getInstance();
        Enfermeiro enfermeiro = new Enfermeiro();

        //Pessoa
        System.out.println("Informe o nome - Obrigatório");
        enfermeiro.setNome(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o gênero: Masculino, Feminino ou Outro - Obrigatório");
        enfermeiro.setGenero(Validacoes.campoObrigatorio(Validacoes.isGeneroValido(scanner.nextLine())));
        System.out.println("Informe a data de nascimento. 00/00/0000 - Obrigatório");
        enfermeiro.setNascimento(Validacoes.isDataValida(scanner.nextLine()));
        System.out.println("Informe o CPF - Obrigatório");
        enfermeiro.setCpf(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o Telefone - Obrigatório");
        enfermeiro.setTelefone(Validacoes.campoObrigatorio(scanner.nextLine()));

        //Enfermeiro
        System.out.println("Informe a Instituição de Ensino da Formação - Obrigatório");
        enfermeiro.setInstituicao(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o COFEN/UF - Obrigatório");
        enfermeiro.setCofen(Validacoes.campoObrigatorio(scanner.nextLine()));
        banco.addEnfermeiro(enfermeiro);
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
