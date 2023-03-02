package controller.relatorios;

import dataAccessObject.Listas;
import models.Medico;
import models.Paciente;

import java.util.List;

public class Medicos {
    public static void listar(int escolha) {
        List<Medico> medicos;
        medicos = Listas.getInstance().getMedicos();
        String filtro = "Erro";
        switch (escolha) {
            case 1:
                filtro = "Clínico Geral";
                break;
            case 2:
                filtro = "Anestesista";
                break;
            case 3:
                filtro = "Dermatologia";
                break;
            case 4:
                filtro = "Ginecologia";
                break;
            case 5:
                filtro = "Neurologia";
                break;
            case 6:
                filtro = "Pediatria";
                break;
            case 7:
                filtro = "Psiquiatria";
                break;
            case 8:
                filtro = "Ortopedia";
                break;
            case 9:
                filtro = "Todos";
                break;
        }
        for (int cont = 0; cont < medicos.size(); cont++) {
            if (medicos.get(cont).getEspecializacao().equals(filtro)) {
                medicos.get(cont).relatorio();
            }
            if (filtro == "Todos") {
                medicos.get(cont).relatorio();
            }
        }
    }
}
