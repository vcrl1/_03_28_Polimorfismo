package com.adecco.modelo;

public class Guitarra extends InstrumentoMusical {
    //Atributos
    //Metodos
    @Override
    public String sonidoEmite() {
        return "gli gli gli";
    }

    //Constructores
    public Guitarra() {
    }
    public Guitarra(String marca, double precio) {
        super(marca, precio);
    }

    //Setters y Getters

    }


