package com.example;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, int año, double capacidadCarga) {
        super(marca, modelo, año);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion [capacidadCarga=" + capacidadCarga + ", marca=" + getMarca() + ", modelo=" + getModelo() + ", año=" + getAño() + "]";
    }
    public String calcularMantenimiento() {
       
        return "Mantenimiento de camión: Revisión de frenos y cambio de aceite cada 10000 km.";
    }
    
}