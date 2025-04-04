/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author Isabela
 */
class Espadachin extends Personaje implements Luchador {
    public Espadachin(String nombre) {
        super(nombre, 90, 20, 4);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(this.ataque);
        System.out.println(this.nombre + " ataca con su espada a " + enemigo.getNombre());
    }
    
    @Override
    public void ataqueRapido(Personaje enemigo) {
        int danio = this.ataque / 2;
        enemigo.recibirDanio(danio);
        System.out.println(this.nombre + " realiza un ataque rápido contra " + enemigo.getNombre());
    }
}
