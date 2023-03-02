package view;

import controller.relatorios.Pacientes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Listagem {
    public static void pacientes(){
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatórios de Pacientes");
        System.out.println("");
        System.out.println("1. Aguardando Atendimento");
        System.out.println("2. Em Atendimento");
        System.out.println("3. Atendido");
        System.out.println("4. Não Atendido");
        System.out.println("5. Todos");
        System.out.println("6. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Informe apenas Números");
            System.out.println("");
            pessoas();
        }
        //Pacientes.metodo(escolha)
        switch (escolha) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

            case 6:
                SubMenu.listagem();
                break;
            default:
                System.out.println("Opção Inválida");
                System.out.println("");

                try {
                    System.out.println("Pressione Enter para Continuar");
                    System.in.read();
                }catch(Exception e){

                }
                pacientes();
                break;
        }
    }
    public static void medicos(){
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatórios de Médicos");
        System.out.println("");
        System.out.println("1. Clínico Geral");
        System.out.println("2. Anestesista");
        System.out.println("3. Dermatologia");
        System.out.println("4. Ginecologia");
        System.out.println("5. Neurologia");
        System.out.println("6. Pediatria");
        System.out.println("7. Psiquiatria");
        System.out.println("8. Ortopedia");
        System.out.println("9. Todos");
        System.out.println("9. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Informe apenas Números");
            System.out.println("");
            pessoas();
        }
        switch (escolha) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:
                break;
            case 5:
                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:
                SubMenu.listagem();
                break;
            default:
                System.out.println("Opção Inválida");
                System.out.println("");

                try {
                    System.out.println("Pressione Enter para Continuar");
                    System.in.read();
                }catch(Exception e){

                }
                medicos();
                break;
        }
    }
    public static void pessoas() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("Relatórios de Pessoas");
        System.out.println("");
        System.out.println("1. Pacientes");
        System.out.println("2. Médicos");
        System.out.println("3. Enfermeiros");
        System.out.println("4. Todos");
        System.out.println("5. Retornar");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Informe apenas Números");
            System.out.println("");
            pessoas();
        }
        switch (escolha) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                SubMenu.listagem();
            default:
                System.out.println("Opção Inválida");
                System.out.println("");

                try {
                    System.out.println("Pressione Enter para Continuar");
                    System.in.read();
                }catch(Exception e){

                }
                pessoas();
                break;
        }
    }
}
