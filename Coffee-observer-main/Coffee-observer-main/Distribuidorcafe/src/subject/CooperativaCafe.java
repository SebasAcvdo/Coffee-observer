package subject;

import observer.Observer;

public interface CooperativaCafe {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(TipoCafe cafe);
}