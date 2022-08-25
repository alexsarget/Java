public class HolaMundo{
    public static void main(String[]args){
        //Definimos la variable
        int miVarEnt=10;
        System.out.println(miVarEnt);
        //Modificamos el valor de la variable
        miVarEnt = 5;
        System.out.println(miVarEnt);

        String miVarCad= "Saludos";
        System.out.println(miVarCad);

        miVarCad="Adios";
        System.out.println(miVarCad);

        //var -Inferencias de tipos en Java
        var miVarEnt2= 15;
        System.out.println(miVarEnt2);

        var miVarCad2="Hola Java";
        System.out.println(miVarCad2);
    }
}