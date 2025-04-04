/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Isabela
 */
class CampoDeBatalla {
    public static void batallaTodosContraTodos(List<Personaje> personajes) {
        Random rand = new Random();
        while (personajes.stream().filter(Personaje::estaVivo).count() > 1) {
            Personaje atacante = personajes.get(rand.nextInt(personajes.size()));
            Personaje defensor = personajes.get(rand.nextInt(personajes.size()));
            
            if (atacante != defensor && atacante.estaVivo() && defensor.estaVivo()) {
                int accion = rand.nextInt(3); // daticos de isa para que funcione jijiji aumentamos a 3 para más probabilidad de habilidad especial//
                if (accion == 0) {
                    atacante.atacar(defensor);
                } else {
                    if (atacante instanceof Guerrero guerrero) {
                        guerrero.golpeFuerte(defensor);
                    } else if (atacante instanceof mago) {
                        ((mago) atacante).lanzarHechizo(defensor);
                    } else if (atacante instanceof Luchador luchador) {
                        luchador.ataqueRapido(defensor);
                    }
                }
                System.out.println(atacante.getNombre() + " tiene " + atacante.getVida() + " de vida restante.");
                System.out.println(defensor.getNombre() + " tiene " + defensor.getVida() + " de vida restante.");
                System.out.println("-----------------------------------");
            }
        }
        
        for (Personaje p : personajes) {
            if (p.estaVivo()) {
                System.out.println("\nEl ganador es: " + p.getNombre());
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Caballero("Levi"));
        personajes.add(new Espadachin("zoro"));
        personajes.add(new Arquero("Legolas"));
        personajes.add(new Peleador("Goku"));
        personajes.add(new Hechicero("Gandalf"));
        
        batallaTodosContraTodos(personajes);
    }
}
/*   
        Personaje luchador = new luchador("baki",);
        Personaje guerrero = new Guerrero("kratos",);
        Personaje mago = new Mago("Gandalf",);
        Personaje peleador = new peleador("goku",);
        Personaje arquero = new arquero("Legolas",);
        Personaje espadachin = new Espadachin("zoro",);*/
