package controller.relatorios;

import dataAccessObject.Listas;
import models.*;

import java.util.List;

public class Pessoas {
    public static void listar(int escolha) {
        switch (escolha) {
            case 1:
                pacientePrint();
                break;
            case 2:
                medicoPrint();
                break;
            case 3:
                enfermeiroPrint();
                break;
            case 4:
                pacientePrint();
                medicoPrint();
                enfermeiroPrint();
                break;
        }
    }

    private static void pacientePrint() {
        List<Paciente> pacientes;
        pacientes = Listas.getInstance().getPacientes();
        System.out.println("Pacientes");
        for (int cont = 0; cont < pacientes.size(); cont++) {
            pacientes.get(cont).relatorioPessoa();
        }
    }

    private static void medicoPrint() {
        List<Medico> medicos;
        medicos = Listas.getInstance().getMedicos();
        System.out.println("Médicos");
        for (int cont = 0; cont < medicos.size(); cont++) {
            medicos.get(cont).relatorioPessoa();
        }
    }

    private static void enfermeiroPrint() {
        List<Enfermeiro> enfermeiros;
        enfermeiros = Listas.getInstance().getEnfermeiros();
        System.out.println("Enfermeiros");
        for (int cont = 0; cont < enfermeiros.size(); cont++) {
            enfermeiros.get(cont).relatorioPessoa();
        }
    }
}
