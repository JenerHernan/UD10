package obj;

import java.util.Random;

public class Password {
	private int longitud;
	private String contrasenya;
	private String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	
	
	public Password(){
		longitud = 8;
		contrasenya = "";
	}
	
	public Password(int lon) {
		Random rand = new Random();
		longitud = lon;
		contrasenya = "";
		for(int i = 0; i < longitud; i++) {
			contrasenya += caracteres.charAt(rand.nextInt(caracteres.length()));
		}
		
	}
	
	public boolean esFuerte() {
		String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minus = "abcdefghijklmnopqrstuvwxyz";
		String numeros = "12343567890";
		int numMayus = 0, numMinus = 0, numNum = 0;
		for(int i = 0; i < contrasenya.length(); i++) {
			
			if(mayus.indexOf(contrasenya.charAt(i)) != -1)
				numMayus++;
			if(minus.indexOf(contrasenya.charAt(i)) != -1)
				numMinus++;
			if(numeros.indexOf(contrasenya.charAt(i)) != -1)
				numNum++;	
		}
		return numMayus >= 2 && numMinus >= 1 && numNum >= 5;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	@Override
	public String toString() {
		return contrasenya;
	}
	
}
