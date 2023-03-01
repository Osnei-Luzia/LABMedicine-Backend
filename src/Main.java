import dao.Listas;
import view.*;

public class Main {
        public static void main(String[] args) {
            Listas.getInstance();
            Menu.apresentar();
        }
}