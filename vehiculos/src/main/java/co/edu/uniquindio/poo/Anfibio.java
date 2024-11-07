package co.edu.uniquindio.poo;

public class Anfibio extends Vehiculo implements iAcuatico, iTerrestre{

    public Anfibio(String marca, String placa) {
        super(marca, placa);
    }

    @Override
    public String toString() {
        return "Anfibio []";
    }

    @Override
    public void encenderApagar(){
        System.out.println("Esta apagado");
    }

    @Override
    public void avanzarRetroceder(){
        System.out.println("Esta avanzando");
    }


    
}
