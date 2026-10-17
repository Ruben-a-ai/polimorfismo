package com.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
       
        ArrayList<Vehiculo> lista = new ArrayList<>();
        lista.add(new Camion("Toyota", "Corolla", 2020, 10000.0));
        lista.add(new Automovil("Honda", "Civic", 2019, 4));
        lista.add(new Motocicleta("Ford", "Focus", 2021, 600));
        lista.add(new Automovil("Chevrolet", "Spark", 2018, 4));

        
        System.out.println();

        lista.stream()
                .filter(v -> v.calcularMantenimiento().contains(""))  
                .map(Vehiculo::getMarca)                         
                .map(String::toUpperCase)                      
                .forEach(marca -> System.out.println("- " + marca));

        System.out.println();
       
        lista.stream()
                .forEach(System.out::println);
    }
}
   
