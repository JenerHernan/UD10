package obj;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numeroAleatorio n = new numeroAleatorio(1000);
		
		try {
			if(n.getNum() % 2 == 0)
				throw new genericException("El numero aleatorio es par");
			else
				throw new genericException("El numero aleatorio es impar");
		}
		catch(genericException e) {
			System.out.println(e);
		}
		
		System.out.println("El numero era: " + n.getNum());
	}

}

