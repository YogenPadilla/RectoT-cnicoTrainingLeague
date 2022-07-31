package Views;

import Model.NaveTripulada;
import Model.VehiculoLanzadera;
import Model.NaveNoTripulada;
import java.util.ArrayList;

public class CrearNaves {

    //se declara las listas para hacer la simulacion de una base de datos
    ArrayList<VehiculoLanzadera> listaVL = new ArrayList<>();
    ArrayList<NaveNoTripulada> listaNNT = new ArrayList<>();
    ArrayList<NaveTripulada> listaNT = new ArrayList<>();
    
    //metodo construcctor de la clase
    public CrearNaves() {
      
    }

    //metodo para agregar un vehiculo lanzadera a la lista del mismo
    public boolean agregarVL(VehiculoLanzadera vl) {
        return listaVL.add(vl);
    }

     //metodo para agregar una nave no tripuolada a la lista de la misma
    public boolean agregarNNT(NaveNoTripulada nnt) {
        return listaNNT.add(nnt);
    }

    //metodo para agregar una nave tripuolada a la lista de la misma
    public boolean agregarNT(NaveTripulada nt) {
        return listaNT.add(nt);
    }

    //metodo para llenar los datos por defecto de los vehiculos lanzaderos
    public void llenarDatosVL() {
        VehiculoLanzadera vl = new VehiculoLanzadera();
        vl.setNombre("Saturno V");
        vl.setEmpuje(3500);
        vl.setPeso(2900);
        vl.setCapaidadTransporte(118);
        vl.setCombustible("Quimico solido");
        vl.setInicioActividad("1967");
        vl.setFinActividad("1973");
        vl.setPais("EE.UU");
        vl.setPotencia("32000x5");
        vl.setEstado(false);
        vl.setAltura(100);
        listaVL.add(vl);

        vl = new VehiculoLanzadera();
        vl.setNombre("Energía");
        vl.setEmpuje(3060);
        vl.setPeso(2400);
        vl.setCapaidadTransporte(100);
        vl.setCombustible("Petroleo refinado y oxigeno liquido");
        vl.setInicioActividad("1987");
        vl.setFinActividad("1988");
        vl.setPais("Rusia/Ucrania");
        vl.setPotencia("28000x5");
        vl.setEstado(false);
        vl.setAltura(60);
        listaVL.add(vl);

        vl = new VehiculoLanzadera();
        vl.setNombre("Delta IV");
        vl.setEmpuje(2500);
        vl.setPeso(1500);
        vl.setCapaidadTransporte(150);
        vl.setCombustible("Propelente liquido");
        vl.setInicioActividad("2002");
        vl.setFinActividad("Act");
        vl.setPais("EE.UU");
        vl.setPotencia("12000x4");
        vl.setEstado(true);
        vl.setAltura(90);
        listaVL.add(vl);
    }

    //metodos para llenar los datos de varias naves no tripuoladas
    public void llenarDatosNNT() {
        NaveNoTripulada nnt = new NaveNoTripulada();
        nnt.setNombre("Cassini-Huygens");
        nnt.setEmpuje((float) 45.39);
        nnt.setPais("EE.UU, Europa e Italia");
        nnt.setInicioActividad("1997");
        nnt.setFinActividad("Act");
        nnt.setCombustible("Monometilhidracina");
        nnt.setDestino("Saturno y sus lunas");
        nnt.setVelocidad(18000);
        nnt.setPeso((float) 0.25);
        nnt.setEstado(true);
        listaNNT.add(nnt);

        nnt = new NaveNoTripulada();
        nnt.setNombre("Mariner X");
        nnt.setEmpuje((float) 65.79);
        nnt.setPais("EE.UU");
        nnt.setInicioActividad("1973");
        nnt.setFinActividad("Act");
        nnt.setCombustible("Monometilhidracina");
        nnt.setDestino("Mercurio");
        nnt.setVelocidad(12500);
        nnt.setPeso((float) 1.93);
        nnt.setEstado(true);
        listaNNT.add(nnt);

        nnt = new NaveNoTripulada();
        nnt.setNombre("New Horizons");
        nnt.setEmpuje((float) 2.84);
        nnt.setPais("EE.UU");
        nnt.setInicioActividad("2006");
        nnt.setFinActividad("Act");
        nnt.setCombustible("Monometilhidracina");
        nnt.setDestino("Pluton");
        nnt.setVelocidad(5600);
        nnt.setPeso((float) 0.85);
        nnt.setEstado(true);
        listaNNT.add(nnt);
    }
    
    //metodos para llenar los datos de varias naves tripuoladas
    public void llenarDatosNT() {
        NaveTripulada nt = new NaveTripulada();
        nt.setNombre("Apolo");
        nt.setCombustible("Aerozina");
        nt.setInicioActividad("1966");
        nt.setFinActividad("1975");
        nt.setPais("EE.UU");
        nt.setFinalidad("Misiones lunares");
        nt.setPeso(67);
        nt.setOrbita(450);
        nt.setCapacidadPersonas(4);
        nt.setEstado(false);
        listaNT.add(nt);

        nt = new NaveTripulada();
        nt.setNombre("Skylab");
        nt.setCombustible("Queroseno");
        nt.setInicioActividad("1973");
        nt.setFinActividad("1979");
        nt.setPais("EE.UU");
        nt.setFinalidad("Misiones lunares");
        nt.setPeso(77);
        nt.setOrbita(435);
        nt.setCapacidadPersonas(5);
        nt.setEstado(false);
        listaNT.add(nt);

        nt = new NaveTripulada();
        nt.setNombre("Salyut");
        nt.setCombustible("Ortonitrato");
        nt.setInicioActividad("1982");
        nt.setFinActividad("1991");
        nt.setPais("Rusia");
        nt.setFinalidad("experimentación y estudio del comportamiento humano en condiciones ingrávidas y en el exterior de la cápsula.");
        nt.setPeso((float) 19.8);
        nt.setOrbita((float) 248.9);
        nt.setCapacidadPersonas(3);
        nt.setEstado(false);
        listaNT.add(nt);
    }

    //metodos para busqueda de naves en todas las listas de naves
    public VehiculoLanzadera buscarVL(String nombre) {
        VehiculoLanzadera aux = null;
        for (int i = 0; i < listaVL.size(); i++) {
            if (listaVL.get(i).getNombre().equalsIgnoreCase(nombre)) {
                aux = listaVL.get(i);
            }
        }
        return aux;
    }

    public NaveNoTripulada buscarNNT(String nombre) {
        NaveNoTripulada aux = null;
        for (int i = 0; i <listaNNT.size(); i++) {
            if (listaNNT.get(i).getNombre().equalsIgnoreCase(nombre)) {
                aux = listaNNT.get(i);
            }
        }
        return aux;
    }

    public NaveTripulada buscarNT(String nombre) {
        NaveTripulada aux = null;
        for (int i = 0; i < listaNT.size(); i++) {
            if (listaNT.get(i).getNombre().equalsIgnoreCase(nombre)) {
                aux = listaNT.get(i);
            }
        }
        return aux;
    }

    //metodos para mostrar la infomarmacio detallada de cada nave
    public String mostrarVL() {
        String salida = "";
        for (int i = 0; i < listaVL.size(); i++) {
            salida += "Nombre: " + listaVL.get(i).getNombre()
                    + "\nEmpuje: " + listaVL.get(i).getPeso() + " T"
                    + "\nCapacidad Transporte: " + listaVL.get(i).getCapaidadTransporte() + " T"
                    + "\nCombustible: " + listaVL.get(i).getCombustible()
                    + "\nActividad: " + listaVL.get(i).getInicioActividad() + " - " + listaVL.get(i).getFinActividad()
                    + "\nPais: " + listaVL.get(i).getPais()
                    + "\nPotencia: " + listaVL.get(i).getPotencia() + " T"
                    + "\nEstato: " + (listaVL.get(i).isEstado() ? "Activo" : "Inactivo") + "\n\n";
        }
        return salida;
    }

    public String mostrarNNT() {
        String salida = "";
        for (int i = 0; i < listaNNT.size(); i++) {
            salida += "Nombre: " + listaNNT.get(i).getNombre()
                    + "\nEmpuje: " + listaNNT.get(i).getPeso() + " T"
                    + "\nPais: " + listaNNT.get(i).getPais()
                    + "\nActividad: " + listaNNT.get(i).getInicioActividad() + " - " + listaNNT.get(i).getFinActividad()
                    + "\nCombustible: " + listaNNT.get(i).getCombustible() + " T"
                    + "\nDestino: " + listaNNT.get(i).getDestino()
                    + "\nVelocidad: " + listaNNT.get(i).getVelocidad() + " Km/H"
                    + "\nPeso: " + listaNNT.get(i).getPeso() + " T"
                    + "\nEstato: " + (listaNNT.get(i).isEstado() ? "Activo" : "Inactivo") + "\n\n";
        }
        return salida;
    }

    public String mostrarNT() {
        String salida = "";
        for (int i = 0; i < listaNT.size(); i++) {
            salida += "Nombre: " + listaNT.get(i).getNombre()
                    + "\nPais: " + listaNT.get(i).getPais()
                    + "\nActividad: " + listaNT.get(i).getInicioActividad() + " - " + listaNT.get(i).getFinActividad()
                    + "\nCombustible: " + listaNT.get(i).getCombustible() + " T"
                    + "\nFinalidad: " + listaNT.get(i).getFinalidad()
                    + "\nPeso: " + listaNT.get(i).getPeso() + " T"
                    + "\nOrbita: " + listaNT.get(i).getOrbita() + " Km"
                    + "\nCapacidad de personas: " + listaNT.get(i).getCapacidadPersonas() + " Personas"
                    + "\nEstato: " + (listaNNT.get(i).isEstado() ? "Activo" : "Inactivo") + "\n\n";
        }
        return salida;
    }

}