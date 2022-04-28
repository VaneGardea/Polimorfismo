package POL;

//import .*;

/*
 Se desarrolla java class "Empleado" para utilizar JFrame...
 se adapta codigo base para generar una clase abstracta empleado. 
 */

/**
 *
 * @author jjggs_000
 */
// se antepone abstract
public abstract class Empleado {
    
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    
    
       // se crea constructor para aplicar polimorfismo
    public Empleado(String nombre, String apellido, String nss){
        primerNombre=nombre;
        apellidoPaterno=apellido;
        numeroSeguroSocial=nss;
    }
    
    public void establecerPrimerNombre(String nombre){
        primerNombre=nombre;
    }
    public String obtenerPrimerNombre(){
        return primerNombre;
    }
    public void establecerApellidoPaterno(String apellido){
        apellidoPaterno=apellido;
    }
    public String obtenerApellidoPaterno(){
        return apellidoPaterno;
    }
    public void establecerNumeroSeguroSocial(String nss){
        numeroSeguroSocial=nss;
    }
    public String obtenerNumeroSeguroSocial(){
        return numeroSeguroSocial;
    }
    //se sobreescribe metodos y devuelve el valor del objeto Empleado
    @Override
    public String toString(){
        return String.format("%s%s\nnumero de seguro social:  %s",obtenerPrimerNombre(),obtenerApellidoPaterno(),obtenerNumeroSeguroSocial());
    }
    // se crea un  metodo abstracto sobrescrito por la clase hija (subclase)
    public abstract double ingresos();// aqui no hay implementacion
    
}
