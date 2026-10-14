package observer;

public class BajoStockObserver implements Observer {
    @Override
    public void actualizar(int stock) {
        if (stock < 20) {
            System.out.println("[BAJO] ¡ALERTA! Stock bajo (" + stock + " unidades). Se debe reabastecer.");
        }
    }
}
