package controller;

import dao.Listas;
import models.Paciente;

public class CadastroPaciente {
    Listas banco = Listas.getInstance();
    public void cadastrar(){
        Paciente paciente = new Paciente();
        banco.addPaciente(paciente);
    }
}
