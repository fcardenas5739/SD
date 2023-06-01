package sd.clientetcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {

    final String HOST = "127.0.0.1";
    final int PUERTO = 5000;
    DataInputStream in;
    DataOutputStream out;

    public void ejecutar() {
     
        try {
            Socket sc = new Socket(HOST, PUERTO);
            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            out.writeUTF("Saludos de parte del Cliente");
                 String mensaje = in.readUTF();
            System.out.println(mensaje);

            Scanner scan = new Scanner(System.in);

            int c = 1, a = 0;

            while (c == 1) {
                a = a + 1;
                System.out.print("Ingrese mensaje: ");
                mensaje = scan.nextLine();
                out.writeUTF("Este es el mensaje número " + a + ": " + mensaje + "\n");
                
                          
                if (mensaje.equals("Bye")) {
                    break;
                }
            }
            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
