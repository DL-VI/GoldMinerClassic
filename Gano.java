import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Gano extends Niveles
{
    public Gano()
    {
        super(750, 500, 1);
        prepare();
    }
    
    public void prepare()
    {   
        int cantOro = 60;
        for (int i = 0; i < cantOro; i++) {
            goldMeta = new GoldMeta();
            //agrega el oro en posiciones random
            addObject(goldMeta,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(450));
        }

        tablero = new Tablero();
        addObject(tablero,379,240);
        MsjGano msjgano = new MsjGano();
        addObject(msjgano,375,240);
    }
}
