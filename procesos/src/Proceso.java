import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Proceso {
    static File fichero = new File("procesos/ficheros/ficheroThread.txt");
    public static void main(String[] args) throws IOException {

       ProcesoWindowsRunnable p1 = new ProcesoWindowsRunnable();
       Thread thread = new Thread(p1);
       thread.start();
       ProcesoWindows p2 = new ProcesoWindows();
       p2.start();


    }

    public static void pintar(String texto) {
        synchronized (fichero) {
            try {
                FileWriter writer = new FileWriter(fichero);
                writer.write(texto + "\n");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
