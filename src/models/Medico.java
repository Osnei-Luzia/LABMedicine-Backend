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

    public String getEspecializacao() {
        return especializacao;
    }

    public void setStatus(String status) {
        if(status=="ativo"){
            this.status = true;
        }else if(status=="inativo"){
            this.status = false;
        }
    }
    public void relatorio(){
        System.out.println("-------------------");
        System.out.println("ID: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Instituição de Formação: "+this.instituicao);
        System.out.println("CRM: "+this.crm);
        System.out.println("Especialização: "+this.especializacao);
        System.out.println("");
    }
}
