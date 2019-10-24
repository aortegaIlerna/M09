
public class ProcesoWindows extends Thread {
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

         Proceso.pintar("Este es un mensaje escrito desde la clase que extiende el método Thread. ");
    }
}
