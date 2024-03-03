import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bolsa extends Objetos
{
    private int valor;
    
    public Bolsa() {  
        this.valor = 120;
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        niveles.dinero += this.valor; 
    }
}
