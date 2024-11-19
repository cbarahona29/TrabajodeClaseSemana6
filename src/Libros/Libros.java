package Libros;

import javax.swing.JOptionPane;

public class Libros {
    public static Libro[] datos = new Libro[3]; 

    public static void mostrar() {
        for (int i = 0; i < datos.length; i++) {
            JOptionPane.showMessageDialog(null, 
                "El nombre del libro es: " + datos[i].getTitulo() + "\n" +
                "El autor del libro es: " + datos[i].getAutor() + "\n" +
                "El precio del libro es: " + datos[i].getPrecio() + "\n" +
                "El ISBN del libro es: " + datos[i].getIsbn() + "\n" +
                "El descuento del libro es: " + datos[i].getDescuento() + "\n" +
                "El precio final del libro es: " + (datos[i].getPrecio() - datos[i].getDescuento()));
        }
    }

    public static double calcularDescuento(double precio, int edad) {
        if (edad >= 18) {
            return precio * 0.25; 
        } else {
            return precio * 0.10;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = new Libro();

            String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
            datos[i].setTitulo(titulo);

            String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
            datos[i].setAutor(autor);

            double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del libro:"));
            datos[i].setPrecio(precio);

            int isbn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ISBN del libro:"));
            datos[i].setIsbn(isbn);

            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
            datos[i].setDescuento(calcularDescuento(precio, edad));
        }

        mostrar();
    }
}
