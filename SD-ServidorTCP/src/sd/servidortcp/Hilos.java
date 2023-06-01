package sd.servidortcp;

/**
 *
 * @author Francisco Cárdenas / Jairo Valle / Fabian Moncada
 */
public class Hilos extends Thread {

    @Override
    //Metodo run heredado desde Thread
    public void run() {
        try {
            Thread.sleep(1000);
            Servidor servidor = new Servidor();
            servidor.ejecutar();
        } catch (InterruptedException e) {
        }
    }
}
