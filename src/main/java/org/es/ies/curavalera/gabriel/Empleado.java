package org.es.ies.curavalera.gabriel;


/**
 *
 * @author yo misma
 */
public class Empleado {
    String dni;
    String nombre;
    String direccion;
    String cargo;
    int numHijos;
    
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    public double calcula_sueldo(double base){
        double total=base;
        
        if(cargo.equals("ENCARGADO"))
            total+=300;
        else if(cargo.equals("DIRECTOR"))
            total+=1000;
        if(numHijos>=3)
            total+=numHijos*50;
        return total;
    }
}
