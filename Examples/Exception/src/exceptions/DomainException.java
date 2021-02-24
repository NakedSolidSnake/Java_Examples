package exceptions;

public class DomainException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public DomainException(String errorMessage) {
		System.out.println(errorMessage);
	}

}
