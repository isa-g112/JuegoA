/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author Isabela
 */
class Hechicero extends Personaje implements mago {

    public Hechicero(String nombre) {
        super(nombre, 70, 22, 2);
    }

    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(this.ataque);
        System.out.println(this.nombre + " lanza una bola de fuego a " + enemigo.getNombre());
    }

    @Override
    public void lanzarHechizo(Personaje enemigo) {
        int danio = this.ataque * 2;
        enemigo.recibirDanio(danio);
        System.out.println(this.nombre + " lanza un hechizo poderoso contra " + enemigo.getNombre());
    }
}
