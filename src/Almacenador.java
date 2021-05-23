import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Almacenador {
	private List<Pila> pilas;
	
	public Almacenador() {
		this.pilas = new LinkedList<Pila>();
	}
	
	public void insertarEnAlgunaPila(Mesada m)
	{
		boolean res = false;

		Iterator<Pila> it = pilas.iterator();
		Pila p;
		
		while(it.hasNext() && res == false)
		{
			p = it.next();
			res = p.intentarApilar(m);
		}
		
		if(!it.hasNext() && res == false)
		{
			Pila pila = new Pila();
			pila.push(m);
			pilas.add(pila);
		}
		
	}
	public int obtenerCantidadPilas()
	{
		return pilas.size();
	}
	
}
