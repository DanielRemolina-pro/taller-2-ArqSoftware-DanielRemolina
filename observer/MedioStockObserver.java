package observer;

public class MedioStockObserver implements Observer {
    @Override
    public void actualizar(int stock) {
        if (stock >= 20 && stock <= 100) {
            System.out.println("[MEDIO] Stock en nivel medio (" + stock + " unidades). Monitorear.");
        }
    }
}
