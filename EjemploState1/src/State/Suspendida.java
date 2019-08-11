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
public class Suspendida implements EstadoVentanilla{
    @Override
    public void atender(Persona persona){
        //cajero ocupado pero si ve que hay un
        //adulto mayor lo atiende
        if(persona.getEdad() > 65){
            System.out.println("Atendiendo a: " + persona.getNombre());                
        }
        else{
            System.out.println("Espere 5 minutos por favor...");
        }
    }
}
