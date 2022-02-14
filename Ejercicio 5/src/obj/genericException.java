package obj;

public class genericException extends Exception{
	private String error;
	
	public genericException(String s) {
		error = s;
	}

	@Override
	public String toString() {
		return error;
	}
	
}
