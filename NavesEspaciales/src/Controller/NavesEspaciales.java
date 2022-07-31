package Controller;

import Model.NaveNoTripulada;
import Model.NaveTripulada;
import Model.VehiculoLanzadera;
import Views.CrearNaves;
import javax.swing.JOptionPane;

public class NavesEspaciales {

    //metodo para mostrar el menu
    public static int menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                        1. Ingresar Vehiculo de lanzamiendo
                                                                        2. Ingresar Nave no tripulada
                                                                        3. Ingresar Nave Tripulada
                                                                        4. Ver naves
                                                                        5. Buscar nave  
                                                                        6. Salir
                                                                        """));
        return opcion;
    }

    //metodo para llenar los datos del objetos de la clase de VehiculoLanzadera
    public static void llenarDatosVL(VehiculoLanzadera vl) {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del Vehiculo lanzadera");
        vl.setNombre(nombre);
        float empuje = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor del empuje (T)"));
        vl.setEmpuje(empuje);
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor del peso (T)"));
        vl.setPeso(peso);
        float capacidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor del capacidad de transporte (T)"));
        vl.setCapaidadTransporte(capacidad);
        String combustible = JOptionPane.showInputDialog("Ingrese tipo de combustible");
        vl.setCombustible(combustible);
        String inicio = JOptionPane.showInputDialog("Ingrese año de inicio de actividad");
        vl.setInicioActividad(inicio);
        String fin = JOptionPane.showInputDialog("Ingrese año de fin de actividad");
        vl.setFinActividad(fin);
        String pais = JOptionPane.showInputDialog("Ingrese pais de origen");
        vl.setPais(pais);
        String potencia = JOptionPane.showInputDialog("Ingrese potencia de la nave");
        vl.setPotencia(potencia);
        String estados[] = {"Activo", "Inactivo"};
        int op = JOptionPane.showOptionDialog(
                null,
                "Estado de la nave",
                "Seleccione estado de la nave",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                estados,
                estados[0]);
        switch (op) {
            case 0 ->
                vl.setEstado(true);
            case 1 ->
                vl.setEstado(true);
        }
    }
    
    //metodo para llenar los datos del objetos de la clase de NaveNoTripulada
    public static void llenarDatosNNT(NaveNoTripulada nnt) {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la nave no tripulada");
        nnt.setNombre(nombre);
        float empuje = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor del empuje (T)"));
        nnt.setEmpuje(empuje);
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor del peso (T)"));
        nnt.setPeso(peso);
        float velocidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor de la velocidad (Km/H)"));
        nnt.setVelocidad(velocidad);
        String combustible = JOptionPane.showInputDialog("Ingrese tipo de combustible");
        nnt.setCombustible(combustible);
        String inicio = JOptionPane.showInputDialog("Ingrese año de inicio de actividad");
        nnt.setInicioActividad(inicio);
        String fin = JOptionPane.showInputDialog("Ingrese año de fin de actividad");
        nnt.setFinActividad(fin);
        String pais = JOptionPane.showInputDialog("Ingrese pais de origen");
        nnt.setPais(pais);
        String destino = JOptionPane.showInputDialog("Ingrese destino de la nave");
        nnt.setDestino(destino);
        String estados[] = {"Activo", "Inactivo"};
        int op = JOptionPane.showOptionDialog(
                null,
                "Estado de la nave",
                "Seleccione estado de la nave",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                estados,
                estados[0]);
        switch (op) {
            case 0 ->
                nnt.setEstado(true);
            case 1 ->
                nnt.setEstado(true);
        }
    }

    //metodo para llenar los datos del objetos de la clase de NaveTripulada
    public static void llenarDatosNT(NaveTripulada nt) {
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la nave no tripulada");
        nt.setNombre(nombre);
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor del peso (T)"));
        nt.setPeso(peso);
        float orbita = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor de la orbita (Km)"));
        nt.setOrbita(orbita);
        String combustible = JOptionPane.showInputDialog("Ingrese tipo de combustible");
        nt.setCombustible(combustible);
        String inicio = JOptionPane.showInputDialog("Ingrese año de inicio de actividad");
        nt.setInicioActividad(inicio);
        String fin = JOptionPane.showInputDialog("Ingrese año de fin de actividad");
        nt.setFinActividad(fin);
        String pais = JOptionPane.showInputDialog("Ingrese pais de origen");
        nt.setPais(pais);
        String finalidad = JOptionPane.showInputDialog("Ingrese finalidad de la nave");
        nt.setFinalidad(finalidad);
        int capPersona = Integer.parseInt(JOptionPane.showInputDialog("Ingrese capacidad de personas de la nave"));
        nt.setCapacidadPersonas(capPersona);
        String estados[] = {"Activo", "Inactivo"};
        int op = JOptionPane.showOptionDialog(
                null,
                "Estado de la nave",
                "Seleccione estado de la nave",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                estados,
                estados[0]);
        switch (op) {
            case 0 ->
                nt.setEstado(true);
            case 1 ->
                nt.setEstado(true);
        }
    }

    //Metodo para mostrar la naves existentes
    public static void mostrarNaves(CrearNaves obj) {
        System.out.println("Vehículos Lanzadera\n" + obj.mostrarVL()
                + "\n-------------------------------------------------------\nNaves no tripuladas\n" + obj.mostrarNNT()
                + "\n--------------------------------------------------------\nNaves tripuladas\n" + obj.mostrarNT());

    }
    
    //metodo para reunir todos los buscadores de casa categoría
    public static String buscar(CrearNaves obj, String nombre) {
        String salida = "";
        VehiculoLanzadera vl = obj.buscarVL(nombre);
        NaveNoTripulada nnt = obj.buscarNNT(nombre);
        NaveTripulada nt = obj.buscarNT(nombre);
        if (vl != null) {
            salida = "Nombre: " + vl.getNombre()
                    + "\nEmpuje: " + vl.getPeso() + " T"
                    + "\nCapacidad Transporte: " + vl.getCapaidadTransporte() + " T"
                    + "\nCombustible: " + vl.getCombustible()
                    + "\nActividad: " + vl.getInicioActividad() + " - " + vl.getFinActividad()
                    + "\nPais: " + vl.getPais()
                    + "\nPotencia: " + vl.getPotencia() + " T"
                    + "\nEstato: " + (vl.isEstado() ? "Activo" : "Inactivo") + "\n\n";
        }
        if (nnt != null) {
            salida = "Nombre: " + nnt.getNombre()
                    + "\nEmpuje: " + nnt.getPeso() + " T"
                    + "\nPais: " + nnt.getPais()
                    + "\nActividad: " + nnt.getInicioActividad() + " - " + nnt.getFinActividad()
                    + "\nCombustible: " + nnt.getCombustible() + " T"
                    + "\nDestino: " + nnt.getDestino()
                    + "\nVelocidad: " + nnt.getVelocidad() + " Km/H"
                    + "\nPeso: " + nnt.getPeso() + " T"
                    + "\nEstato: " + (nnt.isEstado() ? "Activo" : "Inactivo") + "\n\n";
        }
        if (nt != null) {
            salida = "Nombre: " + nt.getNombre()
                    + "\nPais: " + nt.getPais()
                    + "\nActividad: " + nt.getInicioActividad() + " - " + nt.getFinActividad()
                    + "\nCombustible: " + nt.getCombustible() + " T"
                    + "\nFinalidad: " + nt.getFinalidad()
                    + "\nPeso: " + nt.getPeso() + " T"
                    + "\nOrbita: " + nt.getOrbita() + " Km"
                    + "\nCapacidad de personas: " + nt.getCapacidadPersonas() + " Personas"
                    + "\nEstato: " + (nt.isEstado() ? "Activo" : "Inactivo") + "\n\n";
        }

        return salida;
    }

    public static void main(String[] args) {
        CrearNaves obj = new CrearNaves();
        obj.llenarDatosVL();
        obj.llenarDatosNNT();
        obj.llenarDatosNT();
        VehiculoLanzadera vl;
        NaveNoTripulada nnt;
        NaveTripulada nt;
        int op;
        do {
            op = menu();
            switch (op) {
                case 1 -> {
                    vl = new VehiculoLanzadera();
                    llenarDatosVL(vl);
                    if (obj.agregarVL(vl)) {
                        JOptionPane.showMessageDialog(null, "Se agregó la nave exitisamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se agregó la nave.");
                    }
                }
                case 2 -> {
                    nnt = new NaveNoTripulada();
                    llenarDatosNNT(nnt);
                    if (obj.agregarNNT(nnt)) {
                        JOptionPane.showMessageDialog(null, "Se agregó la nave exitisamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se agregó la nave.");
                    }
                }
                case 3 -> {
                    nt = new NaveTripulada();
                    llenarDatosNT(nt);
                    if (obj.agregarNT(nt)) {
                        JOptionPane.showMessageDialog(null, "Se agregó la nave exitisamente.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se agregó la nave.");
                    }
                }
                case 4 -> {
                    mostrarNaves(obj);
                }
                case 5 -> {
                    String nombre = JOptionPane.showInputDialog("Ingrese nombre de nave a buscar");
                    String res = buscar(obj, nombre);
                    JOptionPane.showMessageDialog(null, res);
                }

            }

        } while (op != 6);

    }

}
