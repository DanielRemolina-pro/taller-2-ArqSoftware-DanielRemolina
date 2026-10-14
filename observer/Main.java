package observer;

//DANIEL DAVID REMOLINA PINZON

public class Main {
    public static void main(String[] args) {
        InventorySubject inventario = new InventorySubject();

        Observer bajo = new BajoStockObserver();
        Observer medio = new MedioStockObserver();
        Observer alto = new AltoStockObserver();

        inventario.attach(bajo);
        inventario.attach(medio);
        inventario.attach(alto);

        int[] cambios = {150, 80, 10, 20, 100, 101};
        for (int s : cambios) {
            inventario.setStock(s);
        }

        System.out.println("\n--- Se elimina el observador de stock alto ---");
        inventario.detach(alto);
        inventario.setStock(500); // ya nadie reacciona
    }
}
