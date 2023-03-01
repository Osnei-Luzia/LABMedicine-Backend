package dao;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    private static Listas listas;
    int id;
    List<Paciente> pacientes;
    List<Medico> medicos;
    List<Enfermeiro> enfermeiros;
    private Listas(){
        id = 1;
        pacientes = new ArrayList<>();
        medicos = new ArrayList<>();
        enfermeiros = new ArrayList<>();
    }
    public void addPaciente(Paciente paciente){
        pacientes.add(paciente);
        id++;
    }
    public void addMedico(Medico medico){
        medicos.add(medico);
        id++;
    }
    public void addEnfermeiro(Enfermeiro enfermeiro){
        enfermeiros.add(enfermeiro);
        id++;
    }
    public static Listas getInstance(){
        if(listas==null){
            listas = new Listas();
        }
        return listas;
    }
}
