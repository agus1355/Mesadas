import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Archivo {
	public ArrayList<Mesada> obtenerMesadas(String ruta)
	{
		FileReader fr = null;
		Scanner sc = null;
		ArrayList<Mesada> mesadas = new ArrayList<Mesada>();
		try {
			fr = new FileReader(ruta);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		sc = new Scanner(fr);
		sc.nextInt();
		int alto,
			ancho;
		while(sc.hasNext())
		{
			alto = sc.nextInt();
			ancho = sc.nextInt();
			mesadas.add(new Mesada(alto,ancho));
		}
		sc.close();
		return mesadas;
	}

	public void escribirResultado(String ruta,int cantidadPilas) {
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(ruta);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		pw = new PrintWriter(fw);
		
		pw.println(cantidadPilas);
		
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		pw.close();
	}
}
