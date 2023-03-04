package controller.relatorios;

import controller.generics.Stopper;
import dataAccessObject.Listas;
import models.Paciente;

import java.util.List;

public class RelatorioPaciente {
    public static void listar(int escolha) {
        List<Paciente> pacientes;
        pacientes = Listas.getInstance().getPacientes();
        String filtro = "Erro";
        switch (escolha) {
            case 1:
                filtro = "Aguardando Atendimento";
                break;
            case 2:
                filtro = "Em Atendimento";
                break;
            case 3:
                filtro = "Atendido";
                break;
            case 4:
                filtro = "Não Atendido";
                break;
            case 5:
                filtro = "Todos";
                break;
        }
        System.out.println("Pacientes");
        for (int cont = 0; cont < pacientes.size(); cont++) {
            if (pacientes.get(cont).getStatus().equals(filtro)) {
                pacientes.get(cont).relatorio();
            }
            if (filtro == "Todos") {
                pacientes.get(cont).relatorio();
            }
        }
        Stopper.stop();
    }
}
