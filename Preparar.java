import greenfoot.*; 

public class Preparar extends Niveles
{
    
    public Preparar()
    {
        super(730, 500, 1);
        prepare();
    }
    
    public void act() {
        Greenfoot.delay(170); 
        //cambia al mundo del juego
        Greenfoot.setWorld(new Juego(super.contador + 1));
    }
    
    public void prepare()
    {   
        int cantOro = 60;
        for (int i = 0; i < cantOro; i++) {
            goldMeta = new GoldMeta();
            //agrega el oro en posiciones random
            addObject(goldMeta,Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(450));
        }

        logo = new Logo();
        addObject(logo,375,123);
        tablero = new Tablero();
        addObject(tablero,379,276);
        msj = new Msj();
        addObject(msj,380,246);
        msjValor = new MsjValor();
        addObject(msjValor, 378,285);
    }
}
