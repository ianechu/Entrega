package arry;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arry {
	final static int NUMERO_MAXIMO = 7;
//Ian Palomares Gallego
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> lista = new ArrayList<>();

		for (int i = 0; i < NUMERO_MAXIMO; i++) {
			System.out.println("Dime una palabra:");
			String palabra = sc.next();
			lista.add(palabra);
			System.out.println("La palabra tiene " + lista.get(i).length() + " letras");
		}
	}
}