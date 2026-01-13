package AULA153_exercicio.boa.model.exception;

public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DomainException(String message) {
		super(message);
	}
	
}
