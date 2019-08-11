package State;

public class EstadoNaranja extends EstadoSemaforo{
    public EstadoNaranja( Semaforo objSemaforo ) {
        this.objSemaforo = objSemaforo;
    }

    // -------------------------------------------

    @Override
    public void mostrar() {
        System.out.println("Alerta naranja");
    }
}
   