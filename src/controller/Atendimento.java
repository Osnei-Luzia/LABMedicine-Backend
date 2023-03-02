package controller;

import dataAccessObject.Listas;
import models.Medico;
import models.Paciente;
import view.SubMenu;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Atendimento {
    static Scanner scanner = new Scanner(System.in);

    public static void atualizarStatus() {
        List<Paciente> pacientes;
        pacientes = Listas.getInstance().getPacientes();

        System.out.println("Informe o ID do paciente");
        int pacienteId = scanner.nextInt();

        for (int cont = 0; cont < pacientes.size(); cont++) {
            if (pacientes.get(cont).getId() == pacienteId) {
                campoStatus(pacientes.get(cont));
            }
        }
    }

    public static void atender() {
        List<Paciente> pacientes;
        pacientes = Listas.getInstance().getPacientes();
        List<Medico> medicos;
        medicos = Listas.getInstance().getMedicos();

        System.out.println("Informe o CPF do médico");
        int medicoId = scanner.nextInt();
        System.out.println("Informe o CPF do paciente");
        int pacienteId = scanner.nextInt();
        try {
            for (int cont = 0; cont < medicos.size(); cont++) {
                if (medicos.get(cont).getId() == medicoId) {
                    medicos.get(cont).setAtendimentos();
                }
            }
            for (int cont = 0; cont < pacientes.size(); cont++) {
                if (pacientes.get(cont).getId() == pacienteId) {
                    pacientes.get(cont).setAtendimentos();
                    pacientes.get(cont).setStatus(2);
                }
            }
            System.out.println("Atendimento iniciado.");
            SubMenu.atendimento();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro, verifique os CPFs e tente novamente.");
            SubMenu.atendimento();
        }
    }

    private static Paciente campoStatus(Paciente paciente) {
        try {
            System.out.println("1. Aguardando Atendimento");
            System.out.println("2. Em Atendimento");
            System.out.println("3. Atendido");
            System.out.println("4. Não Atendido");
            int escolha = scanner.nextInt();
            if (escolha > 0 && escolha < 5) {
                paciente.setStatus(scanner.nextInt());
                return paciente;
            }else{
                return campoStatus(paciente);
            }
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas Números");
            System.out.println("");
            return campoStatus(paciente);
        }
    }
}