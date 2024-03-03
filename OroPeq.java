import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class OroPeq extends Objetos
{
    private int valor;
    
    public OroPeq() {  
        this.valor = 50;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        niveles.dinero += this.valor; 
    }
}
