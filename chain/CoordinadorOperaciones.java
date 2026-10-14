package chain;

public class CoordinadorOperaciones implements Handler {
    private Handler siguiente;

    @Override
    public void setSiguiente(Handler siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarReclamo(double monto) {
        if (monto <= 20_000_000) {
            System.out.printf("El coordinador de operaciones resuelve el reclamo de $%,.0f%n", monto);
        } else if (siguiente != null) {
            siguiente.procesarReclamo(monto);
        }
    }
}
