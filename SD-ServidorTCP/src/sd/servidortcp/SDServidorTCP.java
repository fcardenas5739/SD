
package sd.servidortcp;

/**
 *
 * @author Francisco Cárdenas / Jairo Valle / Fabian Moncada
 */


public class SDServidorTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread hilo = new Thread(new Hilos(), "Hilo Servidor");
        hilo.start();
    }
    
}
