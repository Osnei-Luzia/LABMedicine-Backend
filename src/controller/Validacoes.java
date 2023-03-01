package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Validacoes {
    public static LocalDate isDataValida(String data) {
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataFormatada = LocalDate.parse(data, formatter);
            return dataFormatada;
        }
        catch (Exception e) {
            System.out.println("Formato inválido");
            return null;
        }
    }
    public static String campoObrigatorio(String resposta){
        Scanner scanner = new Scanner(System.in);
        while(resposta==null){
            System.out.println("Campo Obrigatório, tente novamente");
            resposta = scanner.nextLine();
        }
        return resposta;
    }
    public static List<String> repetirCampo(String resposta){
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        if(resposta!=null){
            while(resposta!=null){
            lista.add(resposta);
            System.out.println("Informe mais ou deixe em branco.");
            resposta = scanner.nextLine();
            }
            return lista;
        }else{
            return null;
        }

    }
}
