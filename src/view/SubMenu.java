package view;

import controller.Atendimento;
import controller.cadastros.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void cadastro() {
        int escolha;
        System.out.println("-------------------");
        System.out.println("Cadastros");
        System.out.println("");
        System.out.println("1. Paciente");
        System.out.println("2. Médico");
        System.out.println("3. Enfermeiro");
        System.out.println("0. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    CadastroPaciente.cadastrar();
                    break;
                case 2:
                    CadastroMedico.cadastrar();
                    break;
                case 3:
                    CadastroEnfermeiro.cadastrar();
                    break;
                case 0:
                    Menu.apresentar();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    System.out.println("");

                    try {
                        System.out.println("Pressione Enter para Continuar");
                        System.in.read();
                    } catch (Exception e) {

                    }
                    cadastro();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas Números");
            System.out.println("");
            cadastro();
        }

    }

    public static void atendimento() {
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Atendimento");
        System.out.println("");
        System.out.println("1. Atualização do Status de Atendimento do Paciente");
        System.out.println("2. Realização de Atendimento Médico");
        System.out.println("0. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas Números");
            System.out.println("");
            atendimento();
        }
        switch (escolha) {
            case 1:
                Atendimento.atualizarStatus();
                atendimento();
                break;
            case 2:
                Atendimento.atender();
                atendimento();
                break;
            case 0:
                Menu.apresentar();
                break;
            default:
                System.out.println("Opção Inválida");
                System.out.println("");
                try {
                    System.out.println("Pressione Enter para Continuar");
                    System.in.read();
                } catch (Exception e) {

                }
                atendimento();
                break;
        }
    }

    public static void listagem() {
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Listagens");
        System.out.println("");
        System.out.println("1. Pacientes");
        System.out.println("2. Médicos");
        System.out.println("3. Pessoas");
        System.out.println("0. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas Números");
            System.out.println("");
            listagem();
        }
        switch (escolha) {
            case 1:
                Listagem.pacientes();
                break;
            case 2:
                Listagem.medicos();
                break;
            case 3:
                Listagem.pessoas();
                break;
            case 0:
                Menu.apresentar();
                break;
            default:
                System.out.println("Opção Inválida");
                System.out.println("");

                try {
                    System.out.println("Pressione Enter para Continuar");
                    System.in.read();
                } catch (Exception e) {

                }
                listagem();
                break;
        }
    }
}
