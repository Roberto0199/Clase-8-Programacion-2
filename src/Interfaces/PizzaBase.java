package Interfaces;

import Base.Pizza;

public class PizzaBase implements Ipreparable {
    private String nombre;
    private double precio;
    public PizzaBase(String nombre, double precio){
        this.nombre=nombre;
        this.precio = precio;

    }
@Override
    public void prepare(){
    System.out.println("La Pizza se esta preparando");
}
}
