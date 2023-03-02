package view;

import controller.relatorios.RelatorioMedico;
import controller.relatorios.RelatorioPaciente;
import controller.relatorios.RelatorioPessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listagem {
    static Scanner scanner = new Scanner(System.in);
    public static void pacientes() {
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatórios de Pacientes");
        System.out.println("");
        System.out.println("1. Aguardando Atendimento");
        System.out.println("2. Em Atendimento");
        System.out.println("3. Atendido");
        System.out.println("4. Não Atendido");
        System.out.println("5. Todos");
        System.out.println("0. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas Números");
            System.out.println("");
            pacientes();
        }
        if (escolha > 0 && escolha < 6) {
            RelatorioPaciente.listar(escolha);
            pacientes();
        } else if (escolha == 0) {
            SubMenu.listagem();
        } else {
            System.out.println("Opção Inválida");
            System.out.println("");
            try {
                System.out.println("Pressione Enter para Continuar");
                System.in.read();
            } catch (Exception e) {

            }
            pacientes();
        }
    }


    public static void medicos() {
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatórios de Médicos");
        System.out.println("");
        System.out.println("1. Clínico Geral");
        System.out.println("2. Anestesista");
        System.out.println("3. Dermatologia");
        System.out.println("4. Ginecologia");
        System.out.println("5. Neurologia");
        System.out.println("6. Pediatria");
        System.out.println("7. Psiquiatria");
        System.out.println("8. Ortopedia");
        System.out.println("9. Todos");
        System.out.println("0. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas Números");
            System.out.println("");
            medicos();
        }
        if (escolha > 0 && escolha < 10) {
            RelatorioMedico.listar(escolha);
            medicos();
        } else if (escolha == 0) {
            SubMenu.listagem();
        } else {
            System.out.println("Opção Inválida");
            System.out.println("");
            try {
                System.out.println("Pressione Enter para Continuar");
                System.in.read();
            } catch (Exception e) {

            }
            medicos();
        }
    }

    public static void pessoas() {
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatórios de Pessoas");
        System.out.println("");
        System.out.println("1. Pacientes");
        System.out.println("2. Médicos");
        System.out.println("3. Enfermeiros");
        System.out.println("4. Todos");
        System.out.println("0. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas Números");
            System.out.println("");
            pessoas();
        }
        if (escolha > 0 && escolha < 5) {
            RelatorioPessoa.listar(escolha);
            pessoas();
        } else if (escolha == 0) {
            SubMenu.listagem();
        } else {
            System.out.println("Opção Inválida");
            System.out.println("");
            try {
                System.out.println("Pressione Enter para Continuar");
                System.in.read();
            } catch (Exception e) {

            }
            pessoas();
        }
    }
}

