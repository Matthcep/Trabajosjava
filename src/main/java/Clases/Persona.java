package Clases;


class Persona {

    Persona(){}

    Persona(String nombre){
        this.nombre =nombre;
    }
    Persona(String nombre,String cedula){
        this.nombre=nombre;
        this.cedula =cedula;
    }
    private String programa;
    private String nombre;
    private String cedula;
    private String tipoDocumento;
    private String grupoSanguineoCompleto;
    private int edad;
    private String telefono;
    private String nombreAcudiente;
    private String telefonoAcudientel;

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getGrupoSanguineoCompleto() {
        return grupoSanguineoCompleto;
    }

    public void setGrupoSanguineoCompleto(String grupoSanguineoCompleto) {
        this.grupoSanguineoCompleto = grupoSanguineoCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreAcudiente() {
        return nombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        this.nombreAcudiente = nombreAcudiente;
    }

    public String getTelefonoAcudientel() {
        return telefonoAcudientel;
    }

    public void setTelefonoAcudientel(String telefonoAcudientel) {
        this.telefonoAcudientel = telefonoAcudientel;
    }
}
