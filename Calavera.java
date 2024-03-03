import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Calavera extends Objetos
{
    private int valor;
    
    public Calavera() {  
        this.valor = 20;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        if (niveles.dinero > 0)
            niveles.dinero -= this.valor;
    }
}
