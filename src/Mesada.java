
public class Mesada implements Comparable<Mesada>{
	private int alto;
	private int ancho;
	
	public Mesada(int alto,int ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public void rotar()
	{
		int aux = this.alto;
		this.alto = this.ancho;
		this.ancho = aux;
	}

	@Override
	public int compareTo(Mesada m) {
		int res1 = this.alto - m.alto,
			res2 = this.ancho - m.ancho;
		
		if(res1 >= 0 && res2 >= 0)
		{
			return 1; 
		}
		
		if(res1 < 0 && res2 < 0)
			return -1;
		return -2;
	}
	
	@Override
	public String toString() {
		return this.alto + " " + this.ancho; 
	}
}
