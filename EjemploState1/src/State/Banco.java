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
public class Banco {
    private String nombre;
    private String direccion;
    private Ventanilla ventanilla;
    
    public Banco(){
       ventanilla = new Ventanilla(); 
    }
    
    public void atender(Persona persona){
        System.out.println(persona.getNombre() + " ingresa a la fila.");
        ventanilla.atender(persona);
    }
    
    public void suspenderVentanilla(){
        ventanilla.suspender();
    }
    
    public void cerrarVentanilla(){
        ventanilla.cerrar();
    }
    
    public void abrirVentnilla(){
        ventanilla.abrir();
    }
    
    public String getNombre(){
        return nombre;
    }
}


