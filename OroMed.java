import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class OroMed extends Objetos
{
    private int valor;
    
    public OroMed() {  
        this.valor = 100;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        niveles.dinero += this.valor; 
    }
}
