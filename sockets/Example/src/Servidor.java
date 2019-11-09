import java.io.BufferedReader;
        import java.io.DataOutputStream;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.net.ServerSocket;
        import java.net.Socket;


public class Servidor {
    private final int PUERTO = 1234;
    private ServerSocket serverSocket;//Socket correspondiente al servidor
    private Socket socket; //Socket correspondiente al cliente

    public Servidor() throws IOException {
        System.out.println("Iniciando servidor..");
        serverSocket = new ServerSocket(PUERTO);
        socket = new Socket();
    }

    public void initServer() throws IOException {

        do {
            System.out.println("Esperando al cliente...");
            socket = serverSocket.accept();
            System.out.println("Cliente conectado...");

            DataOutputStream cliente = new DataOutputStream(socket.getOutputStream()); //Obtener la entrada del cliente cliente.writeUTF("Petición recibida y aceptada");
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            cliente.writeUTF("Cliente conectado");
            String mensajeServidor;
            while ((mensajeServidor = entrada.readLine()) != null)
                System.out.println(mensajeServidor);
        } while (true);
    }
}
