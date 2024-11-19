/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdeclase;

import javax.swing.JOptionPane;

/**
 *
 * @author danilos
 */
public class Planilla {
    public static void mostrar(){
        for (int i = 0; i < 3; i++) {
 
    JOptionPane.showMessageDialog(null, "El nombre del empleado es: "+datos[i].getNombre());
    JOptionPane.showMessageDialog(null, "El salario del empleado es: "+datos[i].getSalario());
    JOptionPane.showMessageDialog(null, "La bonificacion del empleado es: "+datos[i].getbonificaciones());
    JOptionPane.showMessageDialog(null, "El salario final del empleado es: "+(datos[i].getbonificaciones()+datos[i].getSalario()));
        }
        
    }
    public static int salario_final(int indice){
    double salario=datos[indice].getSalario();
        for (int i = 0; i < 3; i++) {
            if(annios_lab<=5 && salario <=18900){
            bonificacion_lab[indice]=(int)(salario *0.10);
            }
            else if(annios_lab>=7 && salario<=25000 && salario<=4500){
                 bonificacion_lab[indice]=(int)(salario *0.15);
            }
             else if(salario>=4500){
                 bonificacion_lab[indice]=(int)(salario *0.25);
        }
     }
        return bonificacion_lab[indice];
}
    public static bonificaciones datos[]=new bonificaciones[3];
    public static int annios_lab;
    public static int bonificacion_lab[]= new int[3];

    public static void main(String[] args){
    
    String nombre_emp;
    double salario_emp;
    
        for (int i = 0; i < 3; i++) {
            datos[i]=new bonificaciones();
            nombre_emp=JOptionPane.showInputDialog("Favor ingresar el nombre del empleado");
            datos[i].setNombre(nombre_emp);
            salario_emp=Double.parseDouble(JOptionPane.showInputDialog("Favor ingresar el salario del empleado"));
            datos[i].setSalario(salario_emp);
            annios_lab=Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar el tiempo que lleva trabajando"));
            datos[i].setbonificaciones(salario_final(i));
           
        }
        
        mostrar();
}
    
}
