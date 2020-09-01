package hangman;

import org.junit.Assert;
import org.junit.Test;

public class GameScoreTest
{
	@Test
	public void deberiaPasarOriginalScore()
	{
		boolean result = false;
		GameScore score = new OriginalScore();
		
		if(0 <= score.getScore() <= 100)
		{
			result = true;
		}
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void deberiaPasarBonusScore()
	{
		boolean result = false;
		GameScore score = new BonusScore();
		
		if(0 <= score.getScore() <= 100)
		{
			result = true;
		}
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void deberiaPasarPowerBonusScrore()
	{
		boolean result = false;
		GameScore score = new PowerBonusScore();
		
		if(0 <= score.getScore() <= 9999999999999999999999)
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
		
		if(score.getScore() < 0)
		{
			result = false;
		}
		Assert.assertEquals(result, false);
	}
}
