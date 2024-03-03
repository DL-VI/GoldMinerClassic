import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hueso extends Objetos
{
    private int valor;
        
    public Hueso() {  
        this.valor = 10;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        if (niveles.dinero > 0)
            niveles.dinero -= this.valor;
    }
}
