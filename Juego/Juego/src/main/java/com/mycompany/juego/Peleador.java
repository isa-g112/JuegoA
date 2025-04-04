/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juego;

/**
 *
 * @author Isabela
 */
class Peleador extends Personaje implements Luchador {
    public Peleador(String nombre) {
        super(nombre, 110, 12, 6);
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        enemigo.recibirDanio(this.ataque);
        System.out.println(this.nombre + " golpea a " + enemigo.getNombre());
    }
    
    @Override
    public void ataqueRapido(Personaje enemigo) {
        int danio = this.ataque + 3;
        enemigo.recibirDanio(danio);
        System.out.println(this.nombre + " da un combo rápido a " + enemigo.getNombre());
    }
}
