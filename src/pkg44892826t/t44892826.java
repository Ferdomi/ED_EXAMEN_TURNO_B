package pkg44892826t;

import java.util.*;

public class t44892826 {
    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
 
    public AnalistaED_44654545X(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
        salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
 }

 // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        AnalistaED_44654545X emp = new AnalistaED_44654545X("RAUL PALAO",
"44654545X");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
        + " euros, al hacer " + horasExtra + " horas extra.");
 }
}