package hangman.model;

public class BonusScore extends GameScore
{
	public BonusScore()
	{
		super(0);
	}
	
	/*
	@pre	Inicia con un puntaje igual a cero (0)
	@pos    El puntaje final tiene que ser mayor o igual a cero y menor o igual a 100
	@param 	correctCount (puntaje que lleva el jugador hasta ahora)
	@param 	incorrectCount (puntaje que se le va a descontar al jugador)
	@throws EXCEPTION_NEGATIVE_NUMBER
	*/
	@Override
	public int calculateScore(int correctCount, int incorrectCount)
	{
		if (correctCount > 0 && incorrectCount > 0)
		{
			super.setScore(super.getScore() - incorrectCount*5);
			super.setScore(super.getScore() + correctCount*10);
		}
		else
		{
			System.out.println(GameScoreException.EXCEPTION_NEGATIVE_NUMBER);
		}
		return getScore();
	}
}