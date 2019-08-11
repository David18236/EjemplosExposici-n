package State;

public class Main
{
    public static void main(String[] args)
    {
        Semaforo objSemaforo = new Semaforo();

        // Muestra el aviso por defecto (verde, no hay alerta)
        objSemaforo.mostrarAviso();

        objSemaforo.setEstado( new EstadoNaranja(objSemaforo) );
        objSemaforo.mostrarAviso();

        objSemaforo.setEstado( new EstadoRojo(objSemaforo) );
        objSemaforo.mostrarAviso();
    }
}
