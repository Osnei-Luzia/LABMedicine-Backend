package controller;

import dataAcessObject.Listas;
import models.Enfermeiro;

public class CadastroEnfermeiro {
    Listas banco = Listas.getInstance();
    public void cadastrar(){
        Enfermeiro enfermeiro = new Enfermeiro();
        banco.addEnfermeiro(enfermeiro);
    }
}
