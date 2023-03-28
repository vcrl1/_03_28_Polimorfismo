package com.adecco.modelo;

public abstract class InstrumentoMusical {
    //Atributos
    protected String marca;
    protected double precio;

    //Metodos
    public abstract String sonidoEmite();
    @Override
    public String toString() {
        return "InstrumentoMusical{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }

    //Constructores
    public InstrumentoMusical() {
    }
    public InstrumentoMusical(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    //Setters y Getters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
