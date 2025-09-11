package subject;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;


public class DistribuidorCafe implements CooperativaCafe {
    private List<Observer> observers;  
    private TipoCafe ultimoCafe;

    public DistribuidorCafe() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o); 
        System.out.println("Se ha suscrito un nuevo barista.");
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o); 
        System.out.println("Se ha eliminado un barista de la suscripción.");
    }

    @Override
    public void notifyObservers(TipoCafe cafe) {
        for (Observer o : observers) {
            o.update(ultimoCafe); 
        }
    }

    public void añadirVarietalCafe(TipoCafe cafe) {
        this.ultimoCafe = cafe;
        System.out.println("Se ha añadido un nuevo varietal de café. ");
        varietalCafeActualizada(); 
    }

    public void varietalCafeActualizada() {
        notifyObservers(ultimoCafe); 
    }
    
}
