package controller;

import controller.generics.CampoOpcoes;
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
                CampoOpcoes.campoStatus(pacientes.get(cont));
            }
        }
    }
    public static void atender() {
        List<Medico> medicos;
        medicos = Listas.getInstance().getMedicos();
        Medico medicoSelecionado;
        try {
            System.out.println("Informe o ID do médico");
            int medicoId = scanner.nextInt();
            for (Medico medico : medicos) {
                if (medico.getId() == medicoId) {
                    medicoSelecionado = medico;
                }
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Ocorreu um erro, verifique os IDs e tente novamente.");
            SubMenu.atendimento();
        }
        List<Paciente> pacientes;
        pacientes = Listas.getInstance().getPacientes();
        Paciente pacienteSelecionado;
        try {
            System.out.println("Informe o ID do paciente");
            int pacienteId = scanner.nextInt();
            for (Paciente paciente : pacientes) {
                if (paciente.getId() == pacienteId) {
                    //paciente.setAtendimentos();
                    //paciente.setStatus(2);
                    //medico.setAtendimentos();
                    //System.out.println("Atendimento iniciado.");
                }
            }
            SubMenu.atendimento();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Ocorreu um erro, verifique os IDs e tente novamente.");
            SubMenu.atendimento();
        }
    }
}