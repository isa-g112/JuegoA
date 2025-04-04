/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author Isabela
 */
class Arquero extends Personaje implements mago {
    public Arquero(String nombre) {
        super(nombre, 80, 18, 3);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(this.ataque);
        System.out.println(this.nombre + " dispara una flecha a " + enemigo.getNombre());
    }
    
    @Override
    public void lanzarHechizo(Personaje enemigo) {
        int danio = this.ataque + 5;
        enemigo.recibirDanio(danio);
        System.out.println(this.nombre + " lanza un hechizo a " + enemigo.getNombre());
    }
}

