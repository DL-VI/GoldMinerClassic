import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PiedraP extends Objetos
{
    private int valor;
    
    public PiedraP() {  
        this.valor = 25;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        
        if (niveles.dinero > 0)
            niveles.dinero -= this.valor;  
    }
}
