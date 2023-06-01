package sd.clientetcp;

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
            Cliente cliente = new Cliente();
            cliente.ejecutar();
        } catch (InterruptedException e) {
        }
    }
}
