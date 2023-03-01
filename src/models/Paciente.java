package models;

import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa {
    String contato;
    List<String> alergias = new ArrayList<>();
    List<String> cuidados = new ArrayList<>();
    String convenio;
    String numeroConvenio;
    String validadeConvenio;
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

    public void setAlergias(String alergia) {
        this.alergias.add(alergia);
    }

    public void setCuidados(String cuidado) {
        this.cuidados.add(cuidado);
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setNumeroConvenio(String numeroConvenio) {
        this.numeroConvenio = numeroConvenio;
    }

    public void setValidadeConvenio(String validadeConvenio) {
        this.validadeConvenio = validadeConvenio;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}