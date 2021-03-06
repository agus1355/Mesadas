import java.util.Stack;

public class Pila extends Stack<Mesada>{

	private static final long serialVersionUID = 1L;
	
	private static final int mesadaMasGrande = -1;
	private static final int dispar = -2;
	
	public boolean intentarApilar(Mesada m)
	{
		int res = Pila.mesadaMasGrande;
		Mesada mesadaPila;
		Stack<Mesada> aux = new Stack<Mesada>();
		while(!this.isEmpty() && res == mesadaMasGrande)
		{
			mesadaPila = this.peek();
			if((res = mesadaPila.compareTo(m)) < 0)
			{
				m.rotar();
				if((res = mesadaPila.compareTo(m)) == mesadaMasGrande)
				{
					mesadaPila = this.pop();
					aux.push(mesadaPila);
				}
			}
			
		}
		//esto sucede si la mesada es mayor de un lado pero menor del otro, o viceversa
		if(res == dispar) 
		{
			this.devolverElementos(aux);
			return false;
		}
		
		this.push(m);
		this.devolverElementos(aux);
		
		return true;
	}
	
	private void devolverElementos(Stack<Mesada> aux)
	{
		while(!aux.isEmpty())
		{
			this.push(aux.pop());
		}
	}
}
