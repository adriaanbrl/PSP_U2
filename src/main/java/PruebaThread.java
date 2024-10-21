public class PruebaThread extends Thread
{
    private String nombre;

    public PruebaThread(String nombre)
    {
        this.nombre = nombre;
    }

    @Override
    public void run()
    {
        //Dentro del método run se pon e el código que se ejecutará en hilos (en paralelo)
        //Seria como el main del hilo
        System.out.println("Hilo mundo: " + nombre + " - Prioridad: " + this.getPriority());
        try
        {
            Thread.sleep(1000);
            System.out.println("Fin " + nombre);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

}
