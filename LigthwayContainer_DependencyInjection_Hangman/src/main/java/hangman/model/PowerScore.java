package hangman.model;

public class PowerScore extends GameScore
{
	public PowerScore()
	{
		super(0);
	}
	
	/*
	@pre	Inicia con un puntaje igual a cero (0)
	@pre	i tiene que ser mayo o igual a cero
	@pos    El puntaje final tiene que ser mayor o igual a cero
	@param 	correctCount (puntaje que lleva el jugador hasta ahora)
	@param 	incorrectCount (puntaje que se le va a descontar al jugador)
	@throws EXCEPTION_NEGATIVE_NUMBER
	*/
	@Override
	public int calculateScore(int correctCount, int incorrectCount)
	{
		if (correctCount > 0 && incorrectCount > 0)
		{
			super.setScore(super.getScore() - incorrectCount*8);
			for(int i=0; i<correctCount; i++)
			{
				super.setScore(super.getScore() + (correctCount)*(int)(Math.pow(5,i)));
			}
		}
		else
		{
			System.out.println(GameScoreException.EXCEPTION_NEGATIVE_NUMBER);
		}
		
		return super.getScore();
	}
}