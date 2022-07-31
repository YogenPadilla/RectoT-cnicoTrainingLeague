package Model;
//clase abtracta que tiene un atributo en comun entro las clases de categoria VehivuloLazadera y NaveNoTripulada
public abstract class NaveLanzaderaNoTripulada extends Nave {

    private float empuje;

    public NaveLanzaderaNoTripulada() {
        super();
        this.empuje = 0;
    }

    public float getEmpuje() {
        return empuje;
    }

    public void setEmpuje(float empuje) {
        this.empuje = empuje;
    }
    
 

}
