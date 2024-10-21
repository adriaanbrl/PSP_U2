public class PruebaHilosMain
{
    public static void main(String[] args)
    {
        System.out.println("INICIO");
//        PruebaThread pt = new PruebaThread("hilo1");
//        pt.start(); //Con start planifico el hilo para que se ejecute cuando le toque

        int prioridad = Thread.MIN_PRIORITY;
        for(int i = 0; i < 10; i++)
        {
            PruebaThread hilo = new PruebaThread("hilo" + i);
            hilo.setPriority(prioridad);
            hilo.start(); //Con start planifico el hilo para que se ejecute cuando le toque (tarda 1 segundo)
            // hilo.run(); (tarda 10 segundos)
            if(prioridad == PruebaThread.MAX_PRIORITY)
            {
                prioridad = Thread.MIN_PRIORITY;
            }
            else
            {
                prioridad++;
            }

        }

        System.out.println("Termina el principal");

    }
}
