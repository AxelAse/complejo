public class LanzadorHilos {
    public static void main(String[] args) {
        Thread[] hilosAsociados;
        hilosAsociados=new Thread[100];
        for(int i=0; i<100; i++)
        {
            TareaCompleja t=new TareaCompleja();
            Thread hilo= new Thread(t);
            hilo.setName("Hilo: " + i);
            hilo.start();
            hilosAsociados[i]=hilo;
        }
        for(int i=0; i<100; i++)
        {
            Thread hilo=hilosAsociados[i];
            try {
                hilo.join();
            } catch (InterruptedException e) {
                System.out.println("Algún hilo acabó antes de tiempo!");
            }
        }
        System.out.println("El principal ha terminado.");
    }
    
}
