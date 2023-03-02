package dataAccessObject;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    private static Listas listas;
    int id;
    List<Paciente> pacientes;
    List<Medico> medicos;
    List<Enfermeiro> enfermeiros;

    private Listas() {
        id = 0;
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        enfermeiros = new ArrayList<>();
    }

    public void addPaciente(Paciente paciente) {
        paciente.setId(this.id);
        pacientes.add(paciente);
        id++;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void addMedico(Medico medico) {
        medico.setId(this.id);
        medicos.add(medico);
        id++;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void addEnfermeiro(Enfermeiro enfermeiro) {
        enfermeiro.setId(this.id);
        enfermeiros.add(enfermeiro);
        id++;
    }

    public List<Enfermeiro> getEnfermeiros() {
        return enfermeiros;
    }

    public static Listas getInstance() {
        if (listas == null) {
            listas = new Listas();
        }
        return listas;
    }
}