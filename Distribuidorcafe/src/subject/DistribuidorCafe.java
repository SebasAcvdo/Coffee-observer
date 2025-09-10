package subject;

import java.util.ArrayList;
import java.util.List;
import observer.Observer;


public class DistribuidorCafe implements CooperativaCafe {
    private List<Observer> observers;  

    public DistribuidorCafe() {
        observers = new ArrayList<>(); 
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o); 
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o); 
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(); 
        }
    }

    public void añadirVarietalCafe() {
        TipoCafe cafe = new TipoCafe(null, null, null, null, null);
        varietalCafeActualizada(); 
    }
    

    public void varietalCafeActualizada() {
        notifyObservers();
    }
}
