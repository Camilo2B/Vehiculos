package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class EmpresaApp {
    private String nombre;
    private LinkedList<Anfibio> Anfibios;
    private LinkedList<Aereo> aereos;
    private LinkedList<Terrestre> terrestres;
    private LinkedList<Acuatico> acuaticos;

    public EmpresaApp(String nombre) {
        this.Anfibios = new LinkedList<>();
        this.acuaticos = new LinkedList<>();
        this.aereos = new LinkedList<>();
        this.nombre = nombre;
        this.terrestres = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Anfibio> getAnfibios() {
        return Anfibios;
    }

    public void setAnfibios(LinkedList<Anfibio> Anfibios) {
        this.Anfibios = Anfibios;
    }

    public LinkedList<Aereo> getAereos() {
        return aereos;
    }

    public void setAereos(LinkedList<Aereo> aereos) {
        this.aereos = aereos;
    }

    public LinkedList<Terrestre> getTerrestres() {
        return terrestres;
    }

    public void setTerrestres(LinkedList<Terrestre> terrestres) {
        this.terrestres = terrestres;
    }

    public LinkedList<Acuatico> getAcuaticos() {
        return acuaticos;
    }

    public void setAcuaticos(LinkedList<Acuatico> acuaticos) {
        this.acuaticos = acuaticos;
    }

    @Override
    public String toString() {
        return "EmpresaApp [nombre=" + nombre + ", Anfibios=" + Anfibios + ", aereos=" + aereos + ", terrestres="
                + terrestres + ", acuaticos=" + acuaticos + "]";
    }

    public void agregarAnfibio(Anfibio Anfibio){
        Anfibios.add(Anfibio);
    }

    public void agregarTerrestre(Terrestre Terrestre){
        terrestres.add(Terrestre);
    }

    public void agregarAcuatico(Acuatico Actuatico){
        acuaticos.add(Actuatico);
    }

    public void agregarAereo(Aereo Aereo){
        aereos.add(Aereo);
    }

    public static void main(String[] args) {
        
        //Crear Empresa
        var Empresa = new EmpresaApp("FastTrip");

        //Crear aereos
        var avion = new Aereo("Avianca", "89182918");
        var helicoptero = new Aereo("Housten", "81992819");
        Empresa.agregarAereo(avion);
        Empresa.agregarAereo(helicoptero);

        // Crear Terrestres
        var carro = new Terrestre("Audi", "AYE-0192");
        var cuatrimoto = new Terrestre("House", "QYS.910");
        Empresa.agregarTerrestre(carro);
        Empresa.agregarTerrestre(cuatrimoto);

        //Crear Actuaticos
        var motoAcuatica = new Acuatico("Mess", "92891");
        var lancha = new Acuatico("Tress", "918291");
        Empresa.agregarAcuatico(motoAcuatica);
        Empresa.agregarAcuatico(lancha);

        //Crear anfibios
        var anfibio1 = new Anfibio("Koss", "98291");
        var anfibio2 = new Anfibio("Azer", "128632");
        Empresa.agregarAnfibio(anfibio2);
        Empresa.agregarAnfibio(anfibio1);

        //mostrar
        System.out.println(Empresa.toString());

    }


}
