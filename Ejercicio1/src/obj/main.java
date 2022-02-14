package obj;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Scanner s = new Scanner(System.in);
		
		Boolean correcto = false;
		int num = rand.nextInt(500) + 1;
		
		do {
			try {
				int inp;
				System.out.print("En que numero estoy pensando? ");
				inp = s.nextInt();
				if(inp == num)
					correcto = true;
				else
					if(inp < num)
						System.out.println("El numero que estoy pensando es mas grande");
					else
						System.out.println("El numero que estoy pensando es mas pequeño");
			}
			catch(InputMismatchException e) {
				System.out.println("El dato introducido no es un numero entero positivo");
				s.next();
			}
		}while(!correcto);
		
		System.out.println("Muy bien! Ese es el numero");
	}

}
