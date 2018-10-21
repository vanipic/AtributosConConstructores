/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Owner
 */

public class Constructores2 {
    //Ejercicio para llenado de atributos a través de un método constructor

String nombre;

String apellido;

int edad;

public Constructores2 (String nombre, String apellido, int edad) {

this.nombre =  nombre;

this.apellido = apellido;
this.edad = edad;

}

public void reportar() {

JOptionPane.showMessageDialog(null, "El nombre del participante es: "+ this.nombre+"\nEl apellido del participante es: "+this.apellido+"\nEl participante tiene "+this.edad+" años");

}

public static void main (String [] args) {

Constructores2 obj1 = new Constructores2("Juan", "Fernández", 35);

Constructores2 obj2 = new Constructores2("Rodrigo", "Anco", 27);

Constructores2 obj3 = new Constructores2("Marina", "Giordano", 42);

obj1.reportar();

obj2.reportar();

obj3.reportar();

}


}
