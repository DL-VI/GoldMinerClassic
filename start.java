import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class start extends Inicio {
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            //inicia el sonido de intro
            Greenfoot.playSound("intro.wav");
            Greenfoot.delay(20); 
            Greenfoot.setWorld(new Preparar()); 
        }
    }
}
