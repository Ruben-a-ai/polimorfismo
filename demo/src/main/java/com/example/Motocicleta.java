package com.example;

public class  Motocicleta extends Vehiculo{ 
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int año, int cilindrada) {
        super(marca, modelo, año);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta [cilindrada=" + cilindrada + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", año=" + getAño() + "]";
    }
    public String calcularMantenimiento() {
     
        return "Mantenimiento de motocicleta: Cambio de aceite cada 5000 km.";
    
    }

} 

