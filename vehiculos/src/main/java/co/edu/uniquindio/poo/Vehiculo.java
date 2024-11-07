package co.edu.uniquindio.poo;

public class Vehiculo {
    public String placa;
    public String marca;

    public Vehiculo(String marca, String placa) {
        this.marca = marca;

        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo [placa=" + placa + ", marca=" + marca + "]";
    }






    
}
