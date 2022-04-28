package POL;

//import .*;


// se toma como clase Hija
//Los atributos private de la superclase No se pueden utilizar en una subclase 
//Los objetos de EmpleadoBaseMasComision heredan las variables de instancia de Empleado por comision
public class EmpleadoBaseMasComision extends EmpleadoPorComision{

   
    private double salarioBase;
//constructor con 6 argumentos
    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventas, double tarifa, double salario) {
          super(nombre,apellido,nss,ventas,tarifa); //se  aplica herencia
          establecerSalarioBase(salario); // se aplica herencia (se valida y almacena el salario Base
    }
    
    public void establecerSalarioBase(double salario){
        if(salario>=0.0)
            salarioBase=salario;
        else
            throw new IllegalArgumentException("El salario base debe ser mayor a 0.0");
    }
    public double obtenerSalarioBase(){
        return salarioBase;
    }
    @Override
    public double ingresos(){
        return obtenerSalarioBase()+super.ingresos();
    }
    @Override
    
    public String toString(){
        return String.format("%s %s; %s: $%,.2f","empleado con sueldo BASE", super.toString(),"Salario Base",obtenerSalarioBase());
       
    }
           
    
}
