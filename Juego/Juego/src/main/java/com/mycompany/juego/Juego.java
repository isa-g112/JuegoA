/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.juego;

/**
 *
 * @author Isabela
 */
abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;
    
    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public abstract void atacar(Personaje enemigo);
    
    public void recibirDanio(int danio) {
        this.vida -= Math.max(0, danio - this.defensa);
    }
    
    public boolean estaVivo() {
        return this.vida > 0;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getVida() {
        return vida;
    }
}
