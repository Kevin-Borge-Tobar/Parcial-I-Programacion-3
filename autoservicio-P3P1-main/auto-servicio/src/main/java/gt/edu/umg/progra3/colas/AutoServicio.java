package gt.edu.umg.progra3.colas;

public class AutoServicio {

    private ColaImpl colas;

    public AutoServicio(ColaImpl colas) {
        this.colas = colas;
    }

    /**
     * debe retornar el auto que esta en turno, sin sacarlo de la cola
     * @param placa
     * @return
     */
    
    //primer elemento que entra es el primero en salir
    //ingresa un elemento a la cola
    public String ingresarAuto(String placa){
    	colas.enqueue(placa);
        return null;
    }

    public String proximoAuto(){
    	
    	//Retrona la cabeza de la cola pero no lo elimina solo muestra cual es el proximo elemento
    	//en este contexto muestra la cabeza de la cola
        return colas.peek();
    }

    /**
     * debe retornar el auto a entregar y sacarlo de la cola
     * @return
     */
    public String entregarAuto(){
    	
    	//Entrega el auto y lo elimina de la cola
    	return colas.deque();
    }

    public int obtenerAutosEnCola(){
     
        //Muestra el tamanno de la cola
        return colas.size();
    }
}
