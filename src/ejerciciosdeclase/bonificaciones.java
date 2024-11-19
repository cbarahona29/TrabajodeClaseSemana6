package ejerciciosdeclase;

/**
 * Clase bonificaciones para manejar los datos de los empleados.
 */
public class bonificaciones {
     String nombre,genero;
     double salario,bonificaciones;
     int edad;

    
    public bonificaciones() {}

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getbonificaciones() {
        return bonificaciones;
    }

    public void setbonificaciones(double bonificaciones) {
        this.bonificaciones = bonificaciones;
    }
     public int getEdad() {
        return edad;
    }

    public void getEdad(int edad) {
        this.edad = edad;
    }
      public String getGenero() {
        return genero;
    }

    public void getGenero(String nombre) {
        this.genero = genero;
    }
}