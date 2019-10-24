

public class ProcesoWindowsRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
         Proceso.pintar("Este es un mensaje desde la clase que implementa Runnable ");
    }
}