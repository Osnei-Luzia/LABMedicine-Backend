package controller.cadastros;

import controller.generics.CampoOpcoes;
import controller.generics.Stopper;
import dataAccessObject.Listas;
import models.Medico;

import java.util.Scanner;

public class CadastroMedico {
    public static void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        Listas banco = Listas.getInstance();
        Medico medico = new Medico();

        //Pessoa
        System.out.println("Informe o nome - Obrigatório");
        medico.setNome(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o gênero: Masculino, Feminino ou Outro - Obrigatório");
        medico.setGenero(Validacoes.campoObrigatorio(Validacoes.isGeneroValido(scanner.nextLine())));
        System.out.println("Informe a data de nascimento. 00/00/0000 - Obrigatório");
        medico.setNascimento(Validacoes.isDataValida(scanner.nextLine()));
        System.out.println("Informe o CPF - Obrigatório");
        medico.setCpf(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o Telefone - Obrigatório");
        medico.setTelefone(Validacoes.campoObrigatorio(scanner.nextLine()));

        //Medico
        System.out.println("Informe a Instituição de Ensino da Formação - Obrigatório");
        medico.setInstituicao(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe o CRM - Obrigatório");
        medico.setCrm(Validacoes.campoObrigatorio(scanner.nextLine()));
        System.out.println("Informe a especialização - Obrigatório");
        //medico.setEspecializacao(CampoOpcoes.campoEspecializacao());
        System.out.println("O médico está Ativo ou Inativo? - Obrigatório");
        medico.setStatus(Validacoes.campoObrigatorio(Validacoes.isStatusMedicoValido(scanner.nextLine())));
        banco.addMedico(medico);
        System.out.println("Cadastro realizado com Sucesso.");
        Stopper.stop();
        view.SubMenu.cadastro();
    }
}
