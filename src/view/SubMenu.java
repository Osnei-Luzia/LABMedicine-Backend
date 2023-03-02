package view;

import controller.CadastroEnfermeiro;
import controller.CadastroMedico;
import controller.CadastroPaciente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubMenu {
    public static void cadastro(){
        Scanner scanner = new Scanner(System.in);
        int escolha;
        System.out.println("-------------------");
        System.out.println("Cadastros");
        System.out.println("");
        System.out.println("1. Paciente");
        System.out.println("2. Médico");
        System.out.println("3. Enfermeiro");
        System.out.println("4. Retornar");
        System.out.println("-------------------");
        try{
            escolha = scanner.nextInt();
            switch(escolha){
                case 1:
                    CadastroPaciente.cadastrar();
                    break;
                case 2:
                    CadastroMedico.cadastrar();
                    break;
                case 3:
                    CadastroEnfermeiro.cadastrar();
                    break;
                case 4:
                    Menu.apresentar();
                    break;
                default:
                    System.out.println("Opção Inválida");
                    System.out.println("");

                    try {
                        System.out.println("Pressione Enter para Continuar");
                        System.in.read();
                    }catch(Exception e){

                    }
                    cadastro();
                    break;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Informe apenas Números");
            System.out.println("");
            cadastro();
        }

    }
    public static void listagem(){
        Scanner scanner = new Scanner(System.in);
        int escolha;
        System.out.println("-------------------");
        System.out.println("Listagens");
        System.out.println("");
        System.out.println("1. Pacientes");
        System.out.println("2. Médicos");
        System.out.println("3. Enfermeiros");
        System.out.println("4. Todos");
        System.out.println("5. Retornar");
        System.out.println("-------------------");
        escolha = scanner.nextInt();
        switch(escolha){
            case 1:
                //listagem
                break;
            case 2:
                //listagem
                break;
            case 3:
                //listagem
                break;
            case 4:
                //listagem
                break;
            case 5:
                Menu.apresentar();
                break;
        default:
            System.out.println("Opção Inválida");
            System.out.println("");

        try {
            System.out.println("Pressione Enter para Continuar");
            System.in.read();
        }catch(Exception e){

        }
        listagem();
        break;
    }
}
}
