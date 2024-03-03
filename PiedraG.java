import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PiedraG extends Objetos
{
    private int valor;
    
    public PiedraG() {  
        this.valor = 50;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        
        if (niveles.dinero > 0)
            niveles.dinero -= this.valor;
    }
}
