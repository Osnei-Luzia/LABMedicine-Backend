package controller.generics;

import models.Medico;
import models.Paciente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CampoOpcoes {
    static Scanner scanner = new Scanner(System.in);

    public static Paciente campoStatus(Paciente paciente) {
        int escolha = 0;
        try {
            System.out.println("1. Aguardando Atendimento");
            System.out.println("2. Em Atendimento");
            System.out.println("3. Atendido");
            System.out.println("4. Não Atendido");
            escolha = scanner.nextInt();
            if (escolha > 0 && escolha < 5) {
                paciente.setStatus(escolha);
                return paciente;
            } else {
                return campoStatus(paciente);
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Informe apenas Números");
            System.out.println("");
            return campoStatus(paciente);
        }
    }

    public static Medico campoEspecializacao(Medico medico) {
        int escolha = 0;
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
                medico.setEspecializacao(escolha);
                return medico;
            } else {
                return campoEspecializacao(medico);
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Informe apenas Números");
            System.out.println("");
            return campoEspecializacao(medico);
        }
    }
}
