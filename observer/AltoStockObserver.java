package observer;

public class AltoStockObserver implements Observer {
    @Override
    public void actualizar(int stock) {
        if (stock > 100) {
            System.out.println("[ALTO] Stock alto (" + stock + " unidades). Evaluar promociones.");
        }
    }
}
