package org.es.ies.curavalera.gabriel;

/**
 *  Cambio
 * @author yo misma
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado primero = new Empleado("1245678M","Perico de los Palotes");
        
        primero.direccion="C/del Pez,6";
        primero.numHijos=3;
        System.out.println("DNI: "+primero.dni);
        System.out.println("Nombre: "+primero.nombre);
        System.out.println("Cargo: "+primero.cargo);
        System.out.println("Número de hijos: "+primero.numHijos);
        System.out.println("Sueldo: "+primero.calcula_sueldo(1200));
    }

}
