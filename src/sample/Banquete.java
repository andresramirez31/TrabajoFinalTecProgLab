package sample;

public class Banquete {
    public String nombreSalon;
    public String tipoFiesta;

    public Banquete(String nombreSalon, String tipoFiesta) {
        this.nombreSalon = nombreSalon;
        this.tipoFiesta = tipoFiesta;
    }

    public String getNombreSalon() {
        return nombreSalon;
    }

    public void setNombreSalon(String nombreSalon) {
        this.nombreSalon = nombreSalon;
    }

    public String getTipoFiesta() {
        return tipoFiesta;
    }

    public void setTipoFiesta(String tipoFiesta) {
        this.tipoFiesta = tipoFiesta;
    }
}
