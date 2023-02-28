package cadastros;

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
}
