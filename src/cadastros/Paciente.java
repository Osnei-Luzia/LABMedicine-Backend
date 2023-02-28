package cadastros;

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

    //atualizar status paciente
}