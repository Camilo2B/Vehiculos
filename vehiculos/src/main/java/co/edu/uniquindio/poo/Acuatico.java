package co.edu.uniquindio.poo;

public class Acuatico extends Vehiculo implements iAcuatico{

    public Acuatico(String marca, String placa) {
        super(marca, placa);
    }

    @Override
    public String toString() {
        return "Acuatico []"+super.toString();

    }

    @Override
    public void encenderApagar(){
        System.out.println("Esta apagado");
    }


    
}
