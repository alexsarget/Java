public class HolaMundo {
    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union= " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j);// Aqui se realiza la suma de numeros
        System.out.println(i + j + usuario);// Evaluacion de izq a derecha, realiza suma
        System.out.println(usuario + i + j);// contexto cadena
        System.out.println(usuario + (i + j));// Uso de parentesis modifica la prioridad;
    }
}