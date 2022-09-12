import java.util.Scanner;

public class Tarea_1 {
    public static void main(String[] args) {
        System.out.println("Agrega el titulo: ");
        Scanner consola = new Scanner(System.in);
        var titulo = consola.nextLine();
        System.out.println("Agrega un autor: ");
        var autor = consola.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }

}