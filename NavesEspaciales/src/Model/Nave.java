package Model;

//clase que contiene los atributos mas basicos de una nave degún el texto leido
public abstract class Nave {

    private String nombre;
    private float peso;
    private String combustible;
    private String inicioActividad;
    private String finActividad;
    private String pais;
    private boolean estado;

    public Nave() {
        this.nombre = "";
        this.peso = 0;
        this.combustible = "";
        this.inicioActividad = "";
        this.finActividad = "";
        this.pais = "";
        this.estado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getInicioActividad() {
        return inicioActividad;
    }

    public void setInicioActividad(String inicioActividad) {
        this.inicioActividad = inicioActividad;
    }

    public String getFinActividad() {
        return finActividad;
    }

    public void setFinActividad(String finActividad) {
        this.finActividad = finActividad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
