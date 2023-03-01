package models;

public class Medico extends Pessoa{
    String instituicao;
    String crm;
    String especializacao;
    /*
        Clínico Geral
        Anestesista
        Dermatologia
        Ginecologia
        Neurologia
        Pediatria
        Psiquiatria
        Ortopedia
    */
    boolean status;
    int atendimentos = 0;

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
