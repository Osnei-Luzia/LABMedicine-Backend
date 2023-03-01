package controller;

import dataAcessObject.Listas;
import models.Medico;

public class CadastroMedico {
    Listas banco = Listas.getInstance();
    public void cadastrar(){
        Medico medico = new Medico();
        banco.addMedico(medico);
    }
}
