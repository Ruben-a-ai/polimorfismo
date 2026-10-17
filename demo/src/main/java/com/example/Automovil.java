package com.example;

public class Automovil extends Vehiculo {
    private int puertas;

    public Automovil(String marca, String modelo, int año, int puertas) {
        super(marca, modelo, año);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Automovil [puertas=" + puertas + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", año=" + getAño() + "]";
    }
  
    public String calcularMantenimiento() {
        return "Mantenimiento de automóvil: Cambio de aceite cada 5000 km.";
    }
}