package hangman.model;

public abstract class PowerScore extends GameScore
{
	public PowerScore()
	{
		super(0);
	}
	
	@pre	Inicia con un puntaje igual a cero (0)
	@pre	i tiene que ser mayo o igual a cero
	@pos    El puntaje final tiene que ser mayor o igual a cero
	@param 	correctCount (puntaje que lleva el jugador hasta ahora)
	@param 	incorrectCount (puntaje que se le va a descontar al jugador)
	@throws ExcepcionPuntajeNegativo
	@Override
	public int calculateScore(int correctCoun, int incorrectCount)
	{
	}
}