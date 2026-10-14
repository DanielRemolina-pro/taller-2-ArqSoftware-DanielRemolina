package chain;

public class SupervisorAtencionCliente implements Handler {
    private Handler siguiente;

    @Override
    public void setSiguiente(Handler siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarReclamo(double monto) {
        if (monto <= 5_000_000) {
            System.out.printf("El supervisor de atención al cliente resuelve el reclamo de $%,.0f%n", monto);
        } else if (siguiente != null) {
            siguiente.procesarReclamo(monto);
        }
    }
}
