package obj;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, lon;
		ArrayList<Password> contras = new ArrayList<Password>();
		ArrayList<Boolean> correctas = new ArrayList<Boolean>();
		Scanner sc = new Scanner(System.in);
		print("Introduce el numero de contrasenyas:");
		num = sc.nextInt();
		print("Introduce la longitud de las contrasenyas:");
		lon = sc.nextInt();
	
		for(int i = 0; i < num; i++) {
			contras.add(new Password(lon));
			correctas.add(contras.get(i).esFuerte());
		}
		
		for(int i = 0; i < num; i++) {
			if(correctas.get(i))
				print("La contrasenya " + contras.get(i).getContrasenya() + " es fuerte");
			else
				print("La contrasenya " + contras.get(i) + " es debil");
		}

		
	}
	
	static void print(String s) {
		System.out.println(s);
	}
	
}

