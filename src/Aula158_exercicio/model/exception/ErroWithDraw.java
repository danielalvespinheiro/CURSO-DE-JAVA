package Aula158_exercicio.model.exception;

public class ErroWithDraw extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ErroWithDraw(String message) {
		super(message);
	}
	
}
