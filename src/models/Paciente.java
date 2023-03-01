package models;

public class Paciente extends Pessoa {
    String contato;
    String[] alergias;
    String[] cuidados;
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

    public void setAlergias(String alergia,int index) {
        this.alergias[index] = alergia;
    }

    public void setCuidados(String cuidado,int index) {
        this.cuidados[index] = cuidado;
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