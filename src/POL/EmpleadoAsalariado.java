package POL;

//import .*;

/*
 se aplica herencia en la cual la clase hija es "EmpleadoAsalariado" y clase 
 padre  es "Empleado"
 */
   
/**
 *
 * @author jjggs_000
 */
public class EmpleadoAsalariado extends Empleado {
    
    private double salarioSemanal;
    
    // se genera un constructor con cuatro argumentos

    public EmpleadoAsalariado(String nombre, String apellido, String nss, double salario) {
          super(nombre,apellido,nss); // se pasa al constructor de Empleado
          establecerSalarioSemanal(salario);// se valida y almacena el salario,  se debera crear metodo establecerSalarioSemanal
    }
    
    // se genera metodo para establecer el salario
    
    public void establecerSalarioSemanal(double salario){
        if(salario>=0.0)
            salarioSemanal=salario;
        else
            throw new IllegalArgumentException("El salario semanal debe ser mayor o igual a cero");
    }
    public double obtenerSalarioSemanal(){
        return salarioSemanal;
    }
    
    // se sobreescriben los metodos de ingreso "metodo abstracto" para calcular los ingresos
    @Override
    public double ingresos(){
        return obtenerSalarioSemanal();
    
    }
    @Override
    public String toString(){
        return String.format("Empleado asalariado:  %s\n%s: $%,.2f",super.toString(),"Salario semanal",obtenerSalarioSemanal());
    }
    
    
    
    
}
