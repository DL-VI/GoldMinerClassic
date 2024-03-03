import greenfoot.*;  
import java.util.ArrayList;

public class Niveles extends World {
    public int[] nivel = {1,2,3};
    public int[] tiempo = {60,50,40};
    public int[] meta = {250, 300, 350};
    public int dinero, temporizador;
    public static int contador = 0;
    Logo logo;
    Tablero tablero;
    GoldMeta goldMeta;
    Msj msj;
    MsjValor msjValor;
    Objetos Obj;
    
    public Niveles(int x, int y, int z){    
        super(x,y,z); 
        this.temporizador = tiempo[Niveles.contador];
        this.dinero = 0;
    }
    
    public void setTemporizador(int temporizador) {
        this.temporizador = temporizador;
    }
    
    public int getTemporizador() {
        return temporizador;
    }
}