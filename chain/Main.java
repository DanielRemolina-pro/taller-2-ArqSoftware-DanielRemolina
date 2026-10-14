package chain;

//DANIEL DAVID REMOLINA PINZON

public class Main {
    public static void main(String[] args) {
        Handler supervisor = new SupervisorAtencionCliente();
        Handler coordinador = new CoordinadorOperaciones();
        Handler gerente = new GerenteLogistica();
        Handler director = new DirectorGeneral();

        // Cadena de menor a mayor jerarquía
        supervisor.setSiguiente(coordinador);
        coordinador.setSiguiente(gerente);
        gerente.setSiguiente(director);

        double[] reclamos = {3_000_000, 5_000_000, 12_000_000, 20_000_000, 35_000_000, 50_000_000, 80_000_000};
        for (double monto : reclamos) {
            supervisor.procesarReclamo(monto);
        }
    }
}
