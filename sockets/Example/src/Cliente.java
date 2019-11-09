import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

    private final int PUERTO = 1234;
    private final String HOST = "localhost";
    private Socket socket;

    public Cliente() throws IOException {
        System.out.println("Iniciando cliente...");
        socket = new Socket(HOST, PUERTO);
    }

    public void initCliente() throws IOException {
        DataOutputStream salidaServidor;
        DataInputStream din = new DataInputStream(socket.getInputStream());
        salidaServidor = new DataOutputStream(socket.getOutputStream());
        System.out.println(din.readUTF());
        for (int i = 0; i < 2; i++) {
            salidaServidor.writeUTF("Este es el mensaje número " + (i + 1) + "\n");
        }
    }

}
