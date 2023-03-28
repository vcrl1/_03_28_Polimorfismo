package com.adecco.presentacion;

import com.adecco.modelo.Bateria;
import com.adecco.modelo.Flauta;
import com.adecco.modelo.Guitarra;
import com.adecco.modelo.InstrumentoMusical;

public class Main {
    public static void main(String[] args) {
        InstrumentoMusical[] instrumentos= new InstrumentoMusical[3];
        instrumentos[0]=new Flauta("Yamaha",10);
        instrumentos[1]=new Guitarra("JBL",120);
        instrumentos[2]=new Bateria("Drums",300);

        for (InstrumentoMusical elemento:instrumentos) {
            System.out.println("Sonido que emite " + elemento.sonidoEmite());
            System.out.println(elemento.getClass());
            System.out.println("¿Es una guitarra? " + (elemento instanceof InstrumentoMusical));

            if (elemento instanceof Flauta){
                ((Flauta)elemento).instrumentoAire();
                System.out.println("----"+((Flauta) elemento).instrumentoAire());            }
        }

    }
}