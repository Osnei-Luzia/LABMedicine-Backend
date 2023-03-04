package controller.cadastros;

import controller.generics.Stopper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Validacoes {
    public static String isDataValida(String resposta) {
        Scanner scanner = new Scanner(System.in);
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataFormatada = LocalDate.parse(resposta, formatter);
            return resposta;
        } catch (Exception e) {
            System.out.println("Formato inválido, use 00/00/0000");
            return isDataValida(scanner.nextLine());
        }
    }

    public static String campoObrigatorio(String resposta) {
        Scanner scanner = new Scanner(System.in);
        while (resposta == null || resposta == "") {
            System.out.println("Campo Obrigatório, tente novamente");
            resposta = scanner.nextLine();
        }
        return resposta;
    }

    public static List<String> repetirCampo(String resposta) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        while (!resposta.equals("")) {
            lista.add(resposta);
            System.out.println("Informe mais ou deixe em branco.");
            resposta = scanner.nextLine();
        }
        return lista;
    }

    public static String isGeneroValido(String resposta) {
        Scanner scanner = new Scanner(System.in);
        while (!resposta.equals("Masculino") && !resposta.equals("Feminino") && !resposta.equals("Outro")) {
            System.out.println("Somente permitido: Masculino, Feminino ou Outro");
            resposta = scanner.nextLine();
        }
        return resposta;
    }

    public static String isStatusMedicoValido(String resposta) {
        Scanner scanner = new Scanner(System.in);
        while (!resposta.equals("Ativo") && !resposta.equals("ativo") && !resposta.equals("Inativo") && !resposta.equals("inativo")) {
            System.out.println("Somente permitido: Ativo ou Inativo");
            resposta = scanner.nextLine();
        }
        return resposta;
    }

    public static int campoStatus(int escolha) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Aguardando Atendimento");
        System.out.println("2. Em Atendimento");
        System.out.println("3. Atendido");
        System.out.println("4. Não Atendido");
        try {
            escolha = scanner.nextInt();
            if (escolha > 0 && escolha < 5) {
                return escolha;
            } else {
                System.out.println("Opção Inválida");
                Stopper.stop();
                return campoStatus(escolha);
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Informe apenas Números");
            Stopper.stop();
            return campoStatus(escolha);
        }
    }

    public static int campoEspecializacao(int escolha) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Clínico Geral");
        System.out.println("2. Anestesista");
        System.out.println("3. Dermatologia");
        System.out.println("4. Ginecologia");
        System.out.println("5. Neurologia");
        System.out.println("6. Pediatria");
        System.out.println("7. Psiquiatria");
        System.out.println("8. Ortopedia");
        try {
            escolha = scanner.nextInt();
            if (escolha > 0 && escolha < 9) {
                return escolha;
            } else {
                System.out.println("Opção Inválida");
                Stopper.stop();
                return campoEspecializacao(escolha);
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Informe apenas Números");
            Stopper.stop();
            return campoEspecializacao(escolha);
        }
    }
}
