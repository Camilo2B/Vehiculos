package co.edu.uniquindio.poo;

public class Terrestre extends Vehiculo implements iTerrestre {

    public Terrestre(String marca, String placa) {
        super(marca, placa);
    }

    @Override
    public String toString() {
        return "Terrestre []";
    }

    @Override
    public void avanzarRetroceder(){
        System.out.println("Esta avanzando");
    }



    
}
