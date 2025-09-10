package subject;

public class TipoCafe {
    String varietal;
    String notasCata;
    Float alturaCultivo;
    Float cantidadDisponible;
    String origenDepto;
    String origenMuncp;


    public TipoCafe(String varietal, String notasCata, Float alturaCultivo, String origenDepto, String origenMuncp){
        this.varietal = varietal;
        this.notasCata = notasCata;
        this.alturaCultivo = alturaCultivo;
        this.origenDepto = origenDepto;
        this.origenMuncp = origenMuncp;
    }
}
