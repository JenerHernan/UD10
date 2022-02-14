package obj;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2 = 0;
		int op;
		double resultado = 0;
		
		Scanner sc = new Scanner(System.in);
		
		print("Operaciones disponibles\n1-Suma\n2-Resta\n3-Multiplicacion\n4-Division\n5-Potencia\n6-Raiz cuadrada\n");
		print("Introduce la operacion: ");
		op = sc.nextInt();
		
		print("Introduce el primer numero: ");
		n1 = sc.nextFloat();
		
		if(op != 6) {
			print("Introduce el segundo numero: ");
			n2 = sc.nextFloat();
		}
		
		try {
			switch(op) {
				case 1:
					resultado = n1 + n2;
					break;
				case 2:
					resultado = n1 - n2;
					break;
				case 3:
					resultado = n1 * n2;
					break;
				case 4:
					if(n2 == 0)
						throw new ArithmeticException("No divisible entre 0");
					resultado = n1 / n2;
					break;
				case 5:
					resultado = Math.pow(n1, n2);
					break;
				case 6:
					if(n1 < 0)
						throw new genericException("No existe la raiz cuadrada de un numero negativo");
					else
						resultado = Math.sqrt(n1);
			}
			

			print("El resultado es " + resultado);
		}
		catch(genericException | ArithmeticException e) {
			System.out.println(e);
		}
		

	}
	
	static void print(String s) {
		System.out.println(s);
	}
	
}

