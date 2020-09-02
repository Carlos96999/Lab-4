package hangman.model;

public class GameScoreException extends Exception
{
	public static final String EXCEPTION_NEGATIVE_NUMBER = "Has ingresado puntajes negativos";
	
	public GameScoreException(String mensaje)
	{
		super(mensaje);
	}
}