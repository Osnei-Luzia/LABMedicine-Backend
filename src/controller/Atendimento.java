package controller;

import controller.cadastros.Validacoes;
import controller.generics.Stopper;
import dataAccessObject.Listas;
import models.Medico;
import models.Paciente;

import java.util.List;
import java.util.Objects;
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
                pacientes.get(cont).setStatus(Validacoes.campoStatus(0));
            }
        }
    }

    public static void atender() {
        List<Medico> medicos;
        medicos = Listas.getInstance().getMedicos();
        Medico medico = null;
        System.out.println("Informe o ID do médico");
        int medicoId = scanner.nextInt();
        for (int cont = 0; cont < medicos.size(); cont++) {
            if (medicos.get(cont).getId() == medicoId) {
                medico = medicos.get(cont);
            }
        }
        if (!Objects.isNull(medico)) {
            List<Paciente> pacientes;
            pacientes = Listas.getInstance().getPacientes();
            Paciente paciente = null;
            System.out.println("Informe o ID do paciente");
            int pacienteId = scanner.nextInt();
            for (int cont = 0; cont < pacientes.size(); cont++) {
                if (pacientes.get(cont).getId() == pacienteId) {
                    paciente = pacientes.get(cont);
                }
            }
            if (!Objects.isNull(paciente)) {
                paciente.setAtendimentos();
                medico.setAtendimentos();
                System.out.println("Atendimentos registrados");
                Stopper.stop();
            } else {
                System.out.println("Id de Paciente inexistente");
                Stopper.stop();
            }
        } else {
            System.out.println("Id de Médico inexistente");
            Stopper.stop();
        }
    }
}