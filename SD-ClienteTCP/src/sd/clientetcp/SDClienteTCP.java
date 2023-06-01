package sd.clientetcp;

/**
 *
 * @author Francisco Cárdenas / Jairo Valle / Fabian Moncada
 */
public class SDClienteTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Thread hilo = new Thread(new Hilos(), "Hilo Cliente");
        hilo.start();
    }

}
