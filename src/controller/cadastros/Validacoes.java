package controller.cadastros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
}
