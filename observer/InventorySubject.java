package observer;

import java.util.ArrayList;
import java.util.List;

public class InventorySubject {
    private final List<Observer> observadores = new ArrayList<>();
    private int stock;

    public void attach(Observer o) {
        if (o != null && !observadores.contains(o)) {
            observadores.add(o);
        }
    }

    public void detach(Observer o) {
        observadores.remove(o);
    }

    public void notifyObservers() {
        for (Observer o : observadores) {
            o.actualizar(stock);
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        System.out.println("\n>> Stock actualizado a " + stock + " unidades");
        notifyObservers();
    }
}
