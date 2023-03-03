package view;

import controller.generics.Stopper;
import controller.relatorios.RelatorioMedico;
import controller.relatorios.RelatorioPaciente;
import controller.relatorios.RelatorioPessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listagem {
    public static void pacientes() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatório de Pacientes");
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
            Stopper.stop();
            pacientes();
        }
        if (escolha > 0 && escolha < 6) {
            RelatorioPaciente.listar(escolha);
            pacientes();
        } else if (escolha == 0) {
            SubMenu.listagem();
        } else {
            System.out.println("Opção Inválida");
            Stopper.stop();
            pacientes();
        }
    }


    public static void medicos() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatório de Médicos");
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
            Stopper.stop();
            medicos();
        }
        if (escolha > 0 && escolha < 10) {
            RelatorioMedico.listar(escolha);
            medicos();
        } else if (escolha == 0) {
            SubMenu.listagem();
        } else {
            System.out.println("Opção Inválida");
            Stopper.stop();
            medicos();
        }
    }

    public static void pessoas() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatório de Pessoas");
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
            Stopper.stop();
            pessoas();
        }
        if (escolha > 0 && escolha < 5) {
            RelatorioPessoa.listar(escolha);
            pessoas();
        } else if (escolha == 0) {
            SubMenu.listagem();
        } else {
            System.out.println("Opção Inválida");
            Stopper.stop();
            pessoas();
        }
    }
}

