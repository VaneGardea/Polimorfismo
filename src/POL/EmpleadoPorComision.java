package POL;

//import .*;

//  Actividad_2 de Unidad_4 " Uso de herencia ahora la clase padre es EMPLEADO no OBJECT
public class EmpleadoPorComision extends Empleado {
   
    private double ventasBrutas;
   // protected double ventasBrutas;

    private double tarifaComision; 
    //protected double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa) {
        super(nombre,apellido,nss);
        establecerVentasBrutas(ventas);
        establecerTarifaComision(tarifa);
    }
public void establecerTarifaComision(double tarifa) {
        if (tarifa > 0.0 && tarifa < 1.0)
            tarifaComision = tarifa;
        else
            throw new IllegalArgumentException("La tarifa deber ser mayor 0.0 y menor 1.0");
    }

public double obtenerTarifaComision() {
        return tarifaComision;
    }

    public void establecerVentasBrutas(double ventas) {
        if (ventas >= 0.0)
            ventasBrutas = ventas;
        else
            throw new IllegalArgumentException("Las ventas brutas deben ser mayor o igual a 0.0");
    }
    public double obtenerVentasBrutas() {
        return ventasBrutas;
    }
    @Override
public double ingresos() {
        return obtenerTarifaComision()*obtenerVentasBrutas();
    }
   
   
    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f","empleado por comision",super.toString(),"Ventas brutas", obtenerVentasBrutas(), "tarifa de comision", obtenerTarifaComision());
    }

   
}
