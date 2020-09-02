package hangman;

import org.junit.Assert;
import org.junit.Test;
import hangman.model.*;

public class GameScoreTest
{
	@Test
	public void deberiaPasarOriginalScoreLimiteInferior()
	{
		boolean result = false;
		GameScore score = new OriginalScore();
		score.calculateScore(2, 10);
		
		if(0 <= score.getScore() && score.getScore() <= 100)
		{
			result = true;
		}
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void deberiaPasarBonusScoreLimiteInferior()
	{
		boolean result = false;
		GameScore score = new BonusScore();
		score.calculateScore(0, 20);
		
		if(0 <= score.getScore() && score.getScore() <= 100)
		{
			result = true;
		}
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void deberiaPasarBonusScoreLimiteSuperior()
	{
		boolean result = false;
		GameScore score = new BonusScore();
		score.calculateScore(0, 10);
		
		if(0 <= score.getScore() && score.getScore() <= 100)
		{
			result = true;
		}
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void deberiaPasarPowerBonusScroreLimiteInferior()
	{
		boolean result = false;
		GameScore score = new PowerScore();
		score.calculateScore(0, 0);
		
		if(0 <= score.getScore() && score.getScore() <= 99999999)
		{
			result = true;
		}
		Assert.assertEquals(result, true);
	}
	
		@Test
	public void deberiaPasarPowerBonusScroreLimiteSuperior()
	{
		boolean result = false;
		GameScore score = new PowerScore();
		score.calculateScore(6, 5);
		
		if(0 <= score.getScore() && score.getScore() <= 99999999)
		{
			result = true;
		}
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void noDeberiaPasarOriginalScore()
	{
		boolean result = true;
		GameScore score = new OriginalScore();
		score.calculateScore(0, 15);
		
		if(score.getScore() < 0 || score.getScore() > 100)
		{
			result = false;
		}
		Assert.assertEquals(result, false);
	}
	
	@Test
	public void noDeberiaPasarBonusScore()
	{
		boolean result = true;
		GameScore score = new OriginalScore();
		score.calculateScore(0, 15);
		
		if(score.getScore() < 0 || score.getScore() > 100)
		{
			result = false;
		}
		Assert.assertEquals(result, false);
	}
	
	@Test
	public void noDeberiaPasarPowerBonusScore()
	{
		boolean result = true;
		GameScore score = new OriginalScore();
		score.calculateScore(0, 15);
		
		if(score.getScore() < 0)
		{
			result = false;
		}
		Assert.assertEquals(result, false);
	}
}
