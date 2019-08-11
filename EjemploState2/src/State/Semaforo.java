package State;

public class Semaforo
{
    private EstadoSemaforo objEstadoSemaforo;

    // -------------------------------------------

    public Semaforo() {
        this.objEstadoSemaforo = new EstadoVerde(this);
    }

    // -------------------------------------------

    public void setEstado( EstadoSemaforo objEstadoSemaforo ) {
        this.objEstadoSemaforo = objEstadoSemaforo;
    }

    // -------------------------------------------

    public void mostrarAviso() {
        this.objEstadoSemaforo.mostrar();
    }
}