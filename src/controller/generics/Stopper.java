package controller.generics;

public class Stopper {
    public static void stop() {
        System.out.println("");
        try {
            System.out.println("Pressione Enter para Continuar");
            System.in.read();
        } catch (Exception e) {

        }
    }
}
