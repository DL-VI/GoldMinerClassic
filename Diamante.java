import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Diamante extends Objetos
{
    private int valor;
    
    public Diamante() {  
        this.valor = 150;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        niveles.dinero += this.valor; 
    }
}
