package observer;
import subject.DistribuidorCafe;

public class Barista implements Observer {
    String nombre;
    int identificacion;
    Boolean estadoSuscrip;

    public Barista(String nombre, int identificacion, Boolean estadoSuscrip){
        this.nombre= nombre;
        this.identificacion = identificacion;
        this.estadoSuscrip = estadoSuscrip;
    }

    @Override
    public void update() {
    }


}
