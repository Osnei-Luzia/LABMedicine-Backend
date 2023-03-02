package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    String contato;
    List<String> alergias = new ArrayList<>();
    List<String> cuidados = new ArrayList<>();
    String convenio;
    String numeroConvenio;
    LocalDate validadeConvenio;
    String status;
    /*
        1. Aguardando Atendimento
        2. Em Atendimento
        3. Atendido
        4. Não Atendido
    */
    int atendimentos = 0;

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public void setCuidados(List<String> cuidados) {
        this.cuidados = cuidados;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public void setValidadeConvenio(String validadeConvenio) {
        try{
            this.validadeConvenio = LocalDate.parse(validadeConvenio, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }catch(NullPointerException e){
            this.validadeConvenio = null;
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }
}