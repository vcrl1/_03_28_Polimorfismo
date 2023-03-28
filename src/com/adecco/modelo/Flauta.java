package com.adecco.modelo;

public class Flauta extends InstrumentoMusical{

    //Atributos
    //Metodos
    @Override
    public String sonidoEmite() {
        return "flu flu flu";
    }

    public String instrumentoAire(){
        return "Es un instrumento de aire ";
    }

    //Constructores
    public Flauta() {
    }
    public Flauta(String marca, double precio) {
        super(marca, precio);
    }

    //Setters y Getters
}
