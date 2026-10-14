package chain;

public interface Handler {
    void setSiguiente(Handler siguiente);
    void procesarReclamo(double monto);
}
