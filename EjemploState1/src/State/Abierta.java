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
public class Abierta implements EstadoVentanilla{
    @Override
    public void atender(Persona persona){
        System.out.println("Atendiendo a: " + persona.getNombre());
    }
}
