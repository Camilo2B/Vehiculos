package co.edu.uniquindio.poo;

public class Aereo extends Vehiculo implements iAereo{

    public Aereo(String marca, String placa) {
        super(marca, placa);
    }

    @Override
    public String toString() {
        return "Aereo []";
    }

    @Override
    public void despegarAterrizar(){
        System.out.println("Esta despegado");
    }



    
}
