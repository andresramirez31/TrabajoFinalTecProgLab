package sample;

public class Invitacion extends Banquete {
    protected String idInvitacion;
    protected int cedulaAdicional;
    protected int numeroMesa;
    protected invitado invitadoRegistrado;

    public Invitacion(String nombreSalon, String tipoFiesta, String idInvitacion, int numeroMesa) {
        super(nombreSalon, tipoFiesta);
        this.idInvitacion = idInvitacion;
        this.numeroMesa = numeroMesa;

    }

    public String getIdInvitacion() {
        return idInvitacion;
    }

    public void setIdInvitacion(String idInvitacion) {
        this.idInvitacion = idInvitacion;
    }



    public int getCedulaAdicional() {
        return cedulaAdicional;
    }

    public void setCedulaAdicional(int cedulaAdicional) {
        this.cedulaAdicional = cedulaAdicional;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public invitado getInvitadoRegistrado() {
        return invitadoRegistrado;
    }

    public void setInvitadoRegistrado(invitado invitadoRegistrado) {
        this.invitadoRegistrado = invitadoRegistrado;
    }
}
