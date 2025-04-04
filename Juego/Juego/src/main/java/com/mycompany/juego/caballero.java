/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author Isabela
 */
class Caballero extends Personaje implements Guerrero {
    public Caballero(String nombre) {
        super(nombre, 100, 15, 5);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(this.ataque);
        System.out.println(this.nombre + " ataca a " + enemigo.getNombre());
    }
    
    @Override
    public void golpeFuerte(Personaje enemigo) {
        int danio = this.ataque * 2;
        enemigo.recibirDanio(danio);
        System.out.println(this.nombre + " usa Golpe Fuerte contra " + enemigo.getNombre());
    }
}
