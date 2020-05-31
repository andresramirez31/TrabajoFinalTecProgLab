package sample;

public class invitacionExtra{

        protected invitado invitadoPpal;
        protected int cedulaAcompañante;
        protected String nombres;
        protected int Telefono;
        protected String menuComida;

    public invitacionExtra(invitado invitadoPpal, int cedulaAcompañante, String nombres, int telefono, String menuComida) {
        this.invitadoPpal = invitadoPpal;
        this.cedulaAcompañante = cedulaAcompañante;
        this.nombres = nombres;
        Telefono = telefono;
        this.menuComida = menuComida;
    }

    public invitado getinvitadoPpal() {
        return invitadoPpal;
    }

    public void setinvitadoPpal(invitado invitacionPpal) {
        this.invitadoPpal = invitacionPpal;
    }

    public int getCedulaAcompañante() {
        return cedulaAcompañante;
    }

    public void setCedulaAcompañante(int cedulaAcompañante) {
        this.cedulaAcompañante = cedulaAcompañante;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public String getMenuComida() {
        return menuComida;
    }

    public void setMenuComida(String menuComida) {
        this.menuComida = menuComida;
    }
}
