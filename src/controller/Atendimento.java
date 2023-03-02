package controller;

import dataAccessObject.Listas;
import models.Medico;
import models.Paciente;

import java.util.List;
import java.util.Scanner;

public class Atendimento {
    static Scanner scanner = new Scanner(System.in);

    public static void atualizarStatus() {

    }

    public static void atender() {
        List<Paciente> pacientes;
        pacientes = Listas.getInstance().getPacientes();
        List<Medico> medicos;
        medicos = Listas.getInstance().getMedicos();

        System.out.println("Informe o CPF do médico");
        String medicoCpf = scanner.nextLine();
        System.out.println("Informe o CPF do paciente");
        String pacienteCpf = scanner.nextLine();

        for (int cont = 0; cont < medicos.size(); cont++) {
            if (medicos.get(cont).getCpf().equals(medicoCpf)) {
                medicos.get(cont).setAtendimentos();
            }
        }
        for (int cont = 0; cont < pacientes.size(); cont++) {
            if (pacientes.get(cont).getCpf().equals(pacienteCpf)) {
                pacientes.get(cont).setAtendimentos();
            }
        }
    }
}