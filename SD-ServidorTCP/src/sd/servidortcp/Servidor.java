package sd.servidortcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

public class Servidor {

    ServerSocket servidor = null;
    Socket sc = null;
    DataInputStream in;
    DataOutputStream out;
    final int PUERTO = 5000;

    public void ejecutar() {
        java.util.Date fecha = new Date();
        try {
            servidor = new ServerSocket(PUERTO);
            System.out.println("Servidor iniciado");

            while (true) {
                sc = servidor.accept();
                System.out.println("Cliente conectado");
                in = new DataInputStream(sc.getInputStream());
                out = new DataOutputStream(sc.getOutputStream());

                String mensaje = in.readUTF();

                System.out.println(mensaje);
                out.writeUTF("Saludos de parte del Servidor - Hora Local: - " + fecha);

                while (true) {
                    try {

                        mensaje = in.readUTF();
                        System.out.println(mensaje);
                        if (mensaje=="Bye") {
                            break;
                        }

                    } catch (IOException e) {
                        break;
                    }

                }
                sc.close();

                System.out.println("Cliente desconectado");
                  break;
            }

        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
