package obj;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mensaje mostrado por pantalla");
		try {
			throw new genericException("Esto es un objeto Exception");
		}
		catch(genericException e) {
			System.out.println("Excepcion capturada con mensaje : " + e);
		}
		System.out.print("Programa terminado");
		
	}

}
