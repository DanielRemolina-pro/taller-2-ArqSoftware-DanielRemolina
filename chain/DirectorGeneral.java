package chain;

public class DirectorGeneral implements Handler {
    private Handler siguiente;

    @Override
    public void setSiguiente(Handler siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public void procesarReclamo(double monto) {
        System.out.printf("El director general resuelve el reclamo de $%,.0f%n", monto);
    }
}
