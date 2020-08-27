package hangman.model;

public abstract class OriginalScore extends GameScore
{
	public OriginalScore()
	{
		super(100);
	}
	
	@pre	Inicia con un puntaje mayor a cero (100)
	@pos    El puntaje final tiene que ser mayor o igual a cero y menor o igual a 100
	@param 	correctCount (puntaje que lleva el jugador hasta ahora)
	@param 	incorrectCount (puntaje que se le va a descontar al jugador)
	@throws ExcepcionPuntajeNegativo
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws ExcecionPuntajeNegativo
	{
	}
}