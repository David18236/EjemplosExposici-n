/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author David Ospina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", "Perez", 21);
        Persona persona2 = new Persona("Maria", "Lopez", 71);
        Persona persona3 = new Persona("David", "Ospina", 82);
        Persona persona4 = new Persona("Manuela", "Moreno", 42);
        
        Banco banco = new Banco();
        banco.atender(persona1);
        
        banco.suspenderVentanilla();
        
        banco.atender(persona2);
        banco.atender(persona3);
        
        banco.cerrarVentanilla();
        banco.atender(persona4);
    }
    
}
