package gt.edu.umg.progra3.colas;

import java.util.LinkedList;
import java.util.Queue;

public class ColaImpl implements Cola {
	
	Queue<String> queue = new LinkedList<>();
	
	@Override
	//Este metodo introduce un auto con placa x a la cola
	public void enqueue(String item) {
		queue.add(item);
		
	}

	@Override
	public String deque() {
		
		//remueve la cabeza de la cola
		 return queue.remove();
		
	}

	@Override
	public String peek() {
		//devuelve la  cabeza de la cola pero no la eliminan solo es para inspeccinar cual es la cabeza de la cola
		return queue.peek();
	}

	@Override
	public int size() {
		
		// retrona el tamaño de la cola
		return queue.size();
	}

	@Override
	public boolean isEmpty() {
		
		//retorna un booleano indicando si la cola se encuentra vacia
		 return queue.isEmpty();

	}

}
