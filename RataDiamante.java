import greenfoot.*;  

public class RataDiamante extends Objetos{
    private int valor;
    private int velocidad; 
    private boolean moverIzquierda;
    public GreenfootImage [] imgRata = new GreenfootImage[2];
    
    public RataDiamante() {  
        this.valor = 180;
        this.velocidad = 2;
        this.moverIzquierda = false;
        for (int k = 0; k < imgRata.length; k++) 
            imgRata[k] = new GreenfootImage("rataDiamante" + k + ".png");  
    }
    
    public void dinero() {
        Niveles niveles = (Niveles) getWorld();
        niveles.dinero += this.valor;  
    }
    
    public void act() {
        // Verifica si la rata ha alcanzado los límites del mundo
        if (bordeMundo()) 
            moverIzquierda = !moverIzquierda; //cambia la dirección 

        // Mueve la rata en la dirección adecuada
        if (moverIzquierda) {
            move(-velocidad);
            setImage(imgRata[1]);
        } else {
            move(velocidad);
            setImage(imgRata[0]);
        }
    }
    
    // Método para verificar si la rata ha alcanzado los límites del mundo
    private boolean bordeMundo() {
        //getX() tiene la posicion de la rata y getWorld().getWidth() el ancho del mundo
        return getX() <= 0 || getX() >= getWorld().getWidth() - 1;
    }
}
