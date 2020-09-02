package hangman.model;

public abstract class GameScore 
{
	public int score = 0;
	
	public GameScore(int score)
	{
		this.score = score;
	}
	
	public void setScore(int score)
	{
		this.score = score;
	}
	
	public int getScore()
	{
		return score;
	}
	
	/*
	@pre	El puntaje a ingresar tiene que ser mayor o igual a cero
	@pos
	@param correctCount
	@param incorrectCount
	@throws */
	public abstract int calculateScore(int correctCount, int incorrectCount);
}