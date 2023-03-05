# LABMedicine BackEnd
## _Gestão Hospitalar_

LABMedicine Backend é apenas um MVP de aplicação Back-End para gestão de informações de um ambiente hospitalar.

### Sumário

1. [Páginas e suas Funcionalidades](#paginas)
2. [Tecnologias](#tech)
3. [Instalação](#install)

<a id="paginas"></a>
## Páginas e Funcionalidades

Sendo apenas um Produto Viávle Mínimo, o LABMedicine BackEnd é operado inteiramente por terminal, com a funcionalidade de gerir três processos para o cliente: 
- Cadastro de pacientes, médicos e enfermeiros;
- Atendimento, onde é possível atualizar a situação do paciente dentro do hospital;
- Listagem de informações específicas de todos os cadastrados no sistema.

1. [Menu Principal](#menuPrincipal)
2. [Menu de Cadastros](#menuCadastro)
2.1 [Cadastros](#cadastros)
3. [Menu de Atendimentos](#menuAtendimentos)
3.1 [Atualização do Status de Atendimento](#statusAtendimento)
3.2 [Atendimento Médico](#atendimentoMedico)
4. [Menu de Listagens](#menuListagens)
4.1 [Listagem de Pacientes](#listagemPacientes)
4.2 [Listagem de Médicos](#listagemMedicos)
4.3 [Listagem de Pessoas](#listagemPessoas)

<a  id="menuPrincipal"></a>
### Menu Principal
Ao iniciar a aplicação a seguinte [tela](#telaUm) será mostrada com as opções: Cadastros, Atendimentos, Listagens e Sair. Cada uma das opções levará o usuário para a respectiva tela e Sair encerrará a aplicação.

O input deverá ser feito direto no terminal, com apenas números seguido de Enter para confirmação.
<a  id="telaUm"></a>
```
-------------------
LABMedicine-Backend

1. Cadastros
2. Atendimentos
3. Listagens
0. Sair
-------------------
```
<br>

<a  id="#menuCadastro"></a>
### Menu de Cadastros
Na [tela de cadastros](#telaDois) é possível escolher entre três tipos de registros: Paciente, Médico e Enfermeiro. Ao selecionar uma das opções, uma série de perguntas serão feitas para a realização do cadastro escolhido.

A opção Retornar levará o usuário para o menu principal.
<a  id="#telaDois"></a>
```
-------------------
Cadastros

1. Paciente
2. Médico
3. Enfermeiro
0. Retornar
-------------------
```
<br>

<a  id="#cadastros"></a>
####Cadastros
Ao selecionar o cadastro desejado, serão pedidos dados gerais presentes em todos os cadastros e únicos para cada um.
Caso haja alguma inserção incorreta, o sistema retornará um aviso de erro de acordo com o problema. E ao completar o cadastro, o sistema retornará uma mensagem de sucesso.

Dos gerais, é necessário informar em ordem: Nome, Gênero, Data de Nascimento, CPF, Telefone. Estes serão pedidos sequencialmente no terminal, aguardando a inserção do usuário a cada requerimento e são de caráter Obrigatório.
- O campo de Gênero aceita apenas os seguintes formatos: "Masculino", "Feminino", "Outro".
- O campo Data de Nascimento retornará um erro de formatação caso seja inserido alguma data fora do formato "dd/mm/aaaa".

Exemplo em terminal:
```
Informe o nome - Obrigatório
Informe o gênero: Masculino, Feminino ou Outro - Obrigatório
Informe a data de nascimento. 00/00/0000 - Obrigatório
Informe o CPF - Obrigatório
Informe o Telefone - Obrigatório
```
<br>
Dos únicos para Paciente, é necessário informar em ordem, após os dados gerais: Contato de Emergência, Alergias, Cuidados Específicos, Convênio, Número do Convênio, Data de Vencimento do Convênio e Status do Paciente.
- Apenas o Contato de Emergência e Status são de caráter obrigatório.
- Caso alguma Alergia seja informada, será perguntado se o usuário deseja informar mais alguma. Caso o usuário não deseje, deve deixar o campo em branco para a aplicação prosseguir.
- Caso algum Cuidado Específico seja informado, será perguntado se o usuário deseja informar mais algum. Caso o usuário não deseje, deve deixar o campo em branco para a aplicação prosseguir.
- Caso seja informado um Convênio, será pedido o Número de Convênio e Data de Vencimento do mesmo. Data de Vencimento será Obrigatório mas caso não seja informado um Convênio, o cadastro pulará estes campos.

Exemplo em terminal:
```
Informe o contato de emergência - Obrigatório
Informe uma alergia
Informe mais ou deixe em branco.
Informe um cuidado específico
Informe mais ou deixe em branco.
Informe o convênio
Informe o número do convênio
Informe a data de vencimento do convênio - Obrigatório

Informe o Status do Paciente - Obrigatório
1. Aguardando Atendimento
2. Em Atendimento
3. Atendido
4. Não Atendido
```
<br>
Dos únicos para médicos é necessário informar em ordem: após os dados gerais: Instituição de Formação, CRM, Especialização e Status do Médico.
- Todos os campos são de caráter obrigatório.
- O campo de Status do Médico aceita apenas os seguintes formatos: "Ativo", "Inativo", "ativo", "inativo".

Exemplo em terminal:
```
Informe a Instituição de Ensino da Formação - Obrigatório
Informe o CRM - Obrigatório

Informe a especialização - Obrigatório
1. Clínico Geral
2. Anestesista
3. Dermatologia
4. Ginecologia
5. Neurologia
6. Pediatria
7. Psiquiatria
8. Ortopedia
O médico está Ativo ou Inativo? - Obrigatório
```
<br>
Dos únicos para enfermeiro é necessário informar em ordem: após os dados gerais: Instituição de Formação e COFEN/UF. Todos de caráter obrigatório.

Exemplo em terminal
```
Informe a Instituição de Ensino da Formação - Obrigatório
Informe o COFEN/UF - Obrigatório
```
<br>
<a  id="menuAtendimentos"></a>
### Menu Atendimentos
Na [tela de atendimentos](#telaTres) é possível escolher entre dois processos: Atualização do Status de Atendimento do Paciente e Realização de Atendimento Médico.

A opção Retornar levará o usuário para o menu principal.
<a  id="telaTres"></a>
```
-------------------
Atendimento

1. Atualização do Status de Atendimento do Paciente
2. Realização de Atendimento Médico
0. Retornar
-------------------
```
<br>
<a id="statusAtendimento"></a>
####Atualização do Status de Atendimento
O usuário deverá informar o ID do paciente, gerado pelo sistema, e então seu novo status, dentro das opções fornecidas.

Caso o ID não existir no sistema, o usuário será redirecionado para a [tela de atendimentos](#telaTres) após uma mensagem de erro.

Exemplo em terminal
```
Informe o ID do paciente
Informe o Status do Paciente - Obrigatório

1. Aguardando Atendimento
2. Em Atendimento
3. Atendido
4. Não Atendido
```
<br>
<a id="atendimentoMedico"></a>
####Atendimento Médico
O usuário deverá informar o ID do médico que irá atender, em seguida o ID do paciente que será atendido. Caso ambos IDs existam, o atendimento será registrado, incrementando ao número de atendimentos de cada participante e trocando o status do paciente para "Em Atendimento" automaticamente.

Caso quaisquer IDs não existirem no sistema, o usuário será redirecionado para a [tela de atendimentos](#telaTres) após uma mensagem de erro.

Exemplo em terminal
```
Informe o ID do médico
Informe o ID do paciente
```
<br>
<a id="listagens"></a>
###Listagens
Na [tela de listagens](#telaQuatro) é possível escolher entre três tipos de listagens: Pacientes, Médicos e Pessoas.

A opção Retornar levará o usuário para o menu principal.

<a id="telaQuatro"></a>
```
-------------------
Listagens

1. Pacientes
2. Médicos
3. Pessoas
0. Retornar
-------------------
```
<br>
<a id="listagemPacientes"></a>
####Listagem de Pacientes
Dentro da listagem de Pacientes, o usuário poderá filtrar, dentre todos os pacientes cadastrados, pelo Status de Atendimento.

A opção Retornar levará o usuário para a [tela de listagens](#listagens).
```
-------------------
Relatório de Pacientes

1. Aguardando Atendimento
2. Em Atendimento
3. Atendido
4. Não Atendido
5. Todos
0. Retornar
-------------------
```
Ao escolher uma das opções o sistema retornará dos pacientes o ID, o Nome, o Convênio e o Número de Atendimentos no seguinte formato:
```
Pacientes
-------------------
ID: 0
Nome: "Nome Completo do Paciente"
Convênio: "Nome do Convênio"
Número de Atendimentos: 0
```
<br>
<a id="listagemMedicos"></a>
####Listagem de Médicos
Dentro da listagem de Médicos, o usuário poderá filtrar, dentre todos os médicos cadastrados, pela Especialização.

A opção Retornar levará o usuário para a [tela de listagens](#listagens).
```
-------------------
Relatório de Médicos

1. Clínico Geral
2. Anestesista
3. Dermatologia
4. Ginecologia
5. Neurologia
6. Pediatria
7. Psiquiatria
8. Ortopedia
9. Todos
0. Retornar
-------------------
```
Ao escolher uma das opções o sistema retornará dos médicos o ID, o Nome, a Instituição de Formação, CRM e Especialização no seguinte formato:
```
Medicos
-------------------
ID: 2
Nome: 1
Instituição de Formação: 1
CRM: 1
Especialização: Clínico Geral
```
<br>
<a id="listagemPessoas"></a>
####Listagem de Pessoas
Dentro da listagem de Pessoas, o usuário poderá filtrar, dentre todas as pessoas cadastrados, pela Categoria.

A opção Retornar levará o usuário para a [tela de listagens](#listagens).
```
-------------------
Relatório de Pessoas

1. Pacientes
2. Médicos
3. Enfermeiros
4. Todos
0. Retornar
-------------------
```
Ao escolher uma das opções o sistema retornará da categoria selecionada o ID, o Nome e o CPF no seguinte formato:
```
Pacientes
-------------------
ID: 0
Nome: Exemplo
CPF: 100.000.000-00

-------------------
ID: 1
Nome: Exemplo
CPF: 100.000.000-00

Médicos
-------------------
ID: 2
Nome: Exemplo
CPF: 100.000.000-00

-------------------
ID: 3
Nome: Exemplo
CPF: 100.000.000-00

Enfermeiros
-------------------
ID: 4
Nome: Exemplo
CPF: 100.000.000-00
```
<br>

<a id="tech"></a>
## Tecnologias

É utilizado para seu funcionamento:
- [Java] - Linguagem de programação orientada a objetos.
<br>

<a id="install"></a>
## Instalação

Abra o terminal (no Linux) ou o Prompt de Comando (Windows) no mesmo local onde o arquivo Main.java se encontra, por exemplo: "\LABMedicine-Backend\src", e execute os seguintes comandos:
```
javac Main.java
java Main
```

[Java]: <https://www.java.com/>
