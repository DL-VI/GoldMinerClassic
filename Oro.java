import greenfoot.*; 

public class Oro extends Inicio {
    private GreenfootImage[] imagenes;  
    private int indiceImagen;       
    private int tiempoEspera;          
    private int contador;               
    
    public Oro() {
        this.imagenes = new GreenfootImage[4];
        this.contador = 0;
        this.indiceImagen = 0;
        this.tiempoEspera = 10; //tiempo de espera para cambiar la imgen
        for (int i = 0; i < imagenes.length; i++)     
            imagenes[i] = new GreenfootImage("oro" + i + ".png");
    }
    
    public void act() {
        // Verifica si ha pasado el tiempo de espera
        if (contador == tiempoEspera) {
            setImage(imagenes[indiceImagen]);
            indiceImagen++;
            contador = 0;
        }
        else if (indiceImagen == 4)
            indiceImagen = 0; 
        else 
            contador++; 
    }
}
