package Model;

//Clase de contiene los atributos de la categoria de vehiculos lanzadera, heredando los atributos base de Nave
// e implementanto los metodos base de Nave
public class VehiculoLanzadera extends NaveLanzaderaNoTripulada implements MetodosNaves {

    private float capaidadTransporte;
    private int altura;
    private String potencia;

    public VehiculoLanzadera() {
        super();
        this.capaidadTransporte = 0;
        this.altura = 0;
        this.potencia = "";
    }

    public float getCapaidadTransporte() {
        return capaidadTransporte;
    }

    public void setCapaidadTransporte(float capaidadTransporte) {
        this.capaidadTransporte = capaidadTransporte;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void despesgue() {
        System.out.print("La nave está despegando...");
    }

    @Override
    public void acoplamiento() {
        System.out.print("La nave está en acoplamiento...");
    }

    @Override
    public void acelerar() {
      System.out.print("La nave está acelerando ...");
    }

}
