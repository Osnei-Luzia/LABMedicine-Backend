package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.*;

public class Menu {

    public static void apresentar() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        System.out.println("-------------------");
        System.out.println("LABMedicine-Backend");
        System.out.println("");
        System.out.println("1. Cadastros");
        System.out.println("2. Atendimentos");
        System.out.println("3. Listagens");
        System.out.println("0. Sair");
        System.out.println("-------------------");
        try {
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Informe apenas Números");
            System.out.println("");
            apresentar();
        }
        switch (escolha) {
            case 1:
                SubMenu.cadastro();
                break;
            case 2:
                SubMenu.atendimento();
                break;
            case 3:
                SubMenu.listagem();
                break;
            case 0:
                return;
            default:
                System.out.println("Opção Inválida");
                System.out.println("");
                try {
                    System.out.println("Pressione Enter para Continuar");
                    System.in.read();
                } catch (Exception e) {

                }
                apresentar();
                break;
        }
    }
}
