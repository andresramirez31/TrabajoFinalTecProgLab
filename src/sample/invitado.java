package sample;

public class invitado {
    protected String idInvitado;
    protected int numeroDeDocumento;
    protected String nombres;
    protected String apellidos;
    protected String genero;
    protected int edad;
    protected int telefono;
    protected String menuComida;

    public invitado(String idInvitado, int numeroDeDocumento, String nombres, String apellidos, String genero, int edad, int telefono, String menuComida) {
        this.idInvitado = idInvitado;
        this.numeroDeDocumento = numeroDeDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.telefono = telefono;
        this.menuComida = menuComida;
    }

    public String getIdInvitado() {
        return idInvitado;
    }

    public void setIdInvitado(String idInvitado) {
        this.idInvitado = idInvitado;
    }

    public int getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(int numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMenuComida() {
        return menuComida;
    }

    public void setMenuComida(String menuComida) {
        this.menuComida = menuComida;
    }
}
