package com.adecco.presentacion;

import com.adecco.modelo.Bateria;
import com.adecco.modelo.Flauta;
import com.adecco.modelo.Guitarra;
import com.adecco.modelo.InstrumentoMusical;

import java.sql.SQLOutput;

public class ProbarInstanceof {
    public static void main(String[] args) {
        InstrumentoMusical inst1=new Flauta("Yamaha",15);
        System.out.println("¿Es una flauta? "+ (inst1 instanceof Flauta));
        System.out.println("¿Es un instrumento musical? "+(inst1 instanceof InstrumentoMusical));
        System.out.println("¿Es una guitarra? "+(inst1 instanceof Guitarra));
        Flauta f1= (Flauta) inst1; //Cast expression Flauta
        System.out.println(f1.instrumentoAire());

        InstrumentoMusical inst2=new Bateria("Drums", 150);
        System.out.println("¿Es un instrumento de percusión? "+(inst2 instanceof Bateria));
        Bateria g1= (Bateria) inst2;
        System.out.println(g1.instrumentoPercusion());
    }
}
