package obj;

import java.util.Random;

public class numeroAleatorio {
	private int num;
	
	public numeroAleatorio(int n) {
		Random rand = new Random();
		num = rand.nextInt(n);
	}
	
	public int getNum() {
		return num;
	}
	
}
