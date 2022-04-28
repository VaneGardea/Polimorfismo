package POL;

//import .*;

/*
 Hereda de EMPLEADO
 */

/**
 *
 * @author jjggs_000
 */
public class EmpleadoPorHoras extends Empleado {
    
    private double sueldo;
    private double horas;
    
    // se establece constructor ahora con cinco argumentos
    
    public EmpleadoPorHoras(String nombre, String apellido, String nss, double sueldoPorHoras, double horasTrabajadas){
        super(nombre,apellido,nss);
        // se instancian los metodos que se generan en esta java class
        establecerSueldo(sueldoPorHoras);
        establecerHoras(horasTrabajadas);
        
        
    }
    
    public void establecerSueldo(double sueldoPorHoras){
        if(sueldoPorHoras>=0.0)
             sueldo=sueldoPorHoras;
        else
            throw  new IllegalArgumentException("El sueldo por horas debe ser mayor o igual a cero");
    }
    public double obtenerSueldo(){
          return sueldo;
    }
    public void establecerHoras(double horasTrabajadas){
        if((horasTrabajadas>=0.0)&&(horasTrabajadas<=168.0))
              horas = horasTrabajadas;
            else
              throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a cero y menor o igual a 168 horas");
    }
    public double obtenerHoras(){
        return horas;
    }
    // completar o usar override
    //********************+
    @Override
    public double ingresos(){
        if(obtenerHoras()<=40)
            return obtenerSueldo()*obtenerHoras();
        else
            return 40*obtenerSueldo()+(obtenerHoras()-40)*obtenerSueldo()*1.5;
    }
    @Override
    public String toString(){
        return String.format("empleado por horas: %s\n%s:   $%,.2f:  %s: %,.2f",super.toString(),"sueldo por hora",obtenerSueldo(),"horas trabajadas",obtenerHoras());
    }
}
