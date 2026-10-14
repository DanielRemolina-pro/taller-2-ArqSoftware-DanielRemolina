package chain;

public class GerenteLogistica implements Handler {
    private Handler siguiente;

    @Override
    public void setSiguiente(Handler siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarReclamo(double monto) {
        if (monto <= 50_000_000) {
            System.out.printf("El gerente de logística resuelve el reclamo de $%,.0f%n", monto);
        } else if (siguiente != null) {
            siguiente.procesarReclamo(monto);
        }
    }
}
