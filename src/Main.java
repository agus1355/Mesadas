import java.util.ArrayList;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Archivo a = new Archivo();
		ArrayList<Mesada> mesadas = a.obtenerMesadas("in\\caso_normal.in");
		
		Almacenador alm = new Almacenador();
		
		for (Iterator<Mesada> iterator = mesadas.iterator(); iterator.hasNext();) {
			Mesada mesada = (Mesada) iterator.next();
			alm.insertarEnAlgunaPila(mesada);
		}
		
		a.escribirResultado("out\\caso_normal.out",alm.obtenerCantidadPilas());
	}
}
