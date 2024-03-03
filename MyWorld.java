import greenfoot.*;  

public class MyWorld extends World
{
    
    public MyWorld()
    {    
        super(650, 450, 1); 
        prepare();
        mostrarMensaje();
    }
    
    private void mostrarMensaje() {
        // Muestra el texto con el color de la fuente especificado
        showText("Presionar", 200, 320);
        showText("Tirar Gancho", 200, 400);

    }
    
    private void prepare()
    {
        luz luz = new luz();
        addObject(luz, 262,139);
        PersonajeInicio personaje = new PersonajeInicio();
        addObject(personaje,476,280);
        Oro oro= new Oro();
        addObject(oro,261,142);
        start start = new start();
        addObject(start,262,139);
        Tablero tablero = new Tablero();
        addObject(tablero,203,358);
        abajo abajo = new abajo();
        addObject(abajo,200,365);
    }
    
}
