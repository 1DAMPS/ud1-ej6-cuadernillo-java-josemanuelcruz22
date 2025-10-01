public class ej13{
    public static void main (String[] args){
        final double irpf = 0.15;
        int sueldoNeto = 1200;
        double cantidadQuitada = sueldoNeto * irpf;
        System.out.println(sueldoNeto - cantidadQuitada);
    }

}