package Model;
//clase de la categoria de NaveTripulada, hereda de la clase abstracta NaveLanzaderaNoTripulada e
//implementa la clase de los metodos basicos de las naves.
public class NaveTripulada extends Nave implements MetodosNaves{

    private String finalidad;
    private float orbita;
    private int capacidadPersonas;

    public NaveTripulada() {
        super();
        this.finalidad = "";
        this.orbita = 0;
        this.capacidadPersonas = 0;
    }

    public String getFinalidad() {
        return finalidad;
    }

    public void setFinalidad(String finalidad) {
        this.finalidad = finalidad;
    }

    public float getOrbita() {
        return orbita;
    }

    public void setOrbita(float orbita) {
        this.orbita = orbita;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
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
      System.out.print("La nave está acelerando...");
    }

}
