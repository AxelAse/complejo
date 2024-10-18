class TareaCompleja implements Runnable{
    @Override
    public void run()
    {
        for(int i=0; i<100; i++)
        {
            int a=i*3;
        }
        Thread hiloActual= Thread.currentThread();
        System.out.println("Finalizando el hilo " +hiloActual.getName());
    }
}
