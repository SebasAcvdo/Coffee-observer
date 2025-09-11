package observer;
import subject.DistribuidorCafe;
import subject.TipoCafe;

public class Barista implements Observer {
    String nombre;
    int identificacion;
    boolean notificado = false;
    TipoCafe ultimocafe;

    public Barista(String nombre, int identificacion){
        this.nombre= nombre;
        this.identificacion = identificacion;
        this.notificado = false;
        this.ultimocafe = null;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void getnombre() {
        System.out.println("El nombre del barista es: " + nombre);
    }

    public boolean getNotificado() {
        return notificado;
    }

    public TipoCafe getUltimocafe() {
        return ultimocafe;
    }
    
    public void mostrarNotificacion() {
        if (notificado) {
            System.out.println("El barista " + nombre + " ha sido notificado del nuevo varietal de café: " + ultimocafe.getVarietal());
            System.out.println("Detalles del café:");
            System.out.println("Notas de cata: " + ultimocafe.getNotasCata());
            System.out.println("Altura de cultivo: " + ultimocafe.getAlturaCultivo() + " msnm");
            System.out.println("Origen: " + ultimocafe.getOrigenDepto()+ ", " + ultimocafe.getOrigenMuncp());
            System.out.println("Cantidad disponible: " + ultimocafe.getCantidadDisponible());

        } else {
            System.out.println("El barista " + nombre + " no ha recibido nuevas notificaciones.");
        }
    }

    @Override
    public void update(TipoCafe cafe) {
        this.notificado = true;
        this.ultimocafe = cafe;
        System.out.println("Barista, ha sido notificado de un nuevo varietal de cafe. ");
    }
}

