package hangman.model;

import com.google.inject.Inject;

public class OriginalScore extends GameScore
{
	@Inject
	public OriginalScore()
	{
		super(100);
	}
	
	/*
	@pre	Inicia con un puntaje mayor a cero (100)
	@pos    El puntaje final tiene que ser mayor o igual a cero y menor o igual a 100
	@param 	correctCount (puntaje que lleva el jugador hasta ahora)
	@param 	incorrectCount (puntaje que se le va a descontar al jugador)
	@throws GameScoreException
	*/
	@Override
	public int calculateScore(int correctCount, int incorrectCount)
	{
		if (incorrectCount > 0)
		{
			super.setScore(super.getScore() - incorrectCount*10);
		}
		else
		{
			System.out.println(GameScoreException.EXCEPTION_NEGATIVE_NUMBER);
		}
		return super.getScore();
	}
}