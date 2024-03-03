import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class OroGrd extends Objetos
{
    private int valor;
    
    public OroGrd() {  
        this.valor = 150;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        niveles.dinero += this.valor; 
    }
}
