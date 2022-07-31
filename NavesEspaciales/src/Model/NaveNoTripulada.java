
package Model;

//clase de la categoria de NaveNoTripulada, hereda de la clase abstracta NaveLanzaderaNoTripulada e
//implementa la clase de los metodos basicos de las naves.
public class NaveNoTripulada extends NaveLanzaderaNoTripulada implements MetodosNaves{

    private String destino;
    private float velocidad;

    public NaveNoTripulada() {
        super();
        this.destino = "";
        this.velocidad = 0;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
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
