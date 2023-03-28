package com.adecco.modelo;

public class Bateria extends InstrumentoMusical{
    //Atributos
    //Metodos
    @Override
    public String sonidoEmite() {
        return "pum pum pum";
    }

    public String instrumentoPercusion(){
        return "Es un instrumento de percusión. ";
    }
    //Constructores

    public Bateria() {
    }

    public Bateria(String marca, double precio) {
        super(marca, precio);
    }
//Setters y Getters
}
