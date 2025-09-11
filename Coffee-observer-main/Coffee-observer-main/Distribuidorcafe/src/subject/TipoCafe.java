package subject;

public class TipoCafe {
    String varietal;
    String notasCata;
    Float alturaCultivo;
    Float cantidadDisponible;
    String origenDepto;
    String origenMuncp;


    public TipoCafe(String varietal, String notasCata, Float alturaCultivo, String origenDepto, String origenMuncp, Float cantidadDisponible) {
        this.varietal = varietal;
        this.notasCata = notasCata;
        this.alturaCultivo = alturaCultivo;
        this.origenDepto = origenDepto;
        this.origenMuncp = origenMuncp;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getVarietal() {
        return varietal;
    }

    public String getNotasCata() {
        return notasCata;
    }
    
    public Float getAlturaCultivo() {
        return alturaCultivo;
    }

    public String getOrigenDepto() {
        return origenDepto;
    }

    public String getOrigenMuncp() {
        return origenMuncp;
    }

    public Float getCantidadDisponible() {
        return cantidadDisponible;
    }
}
