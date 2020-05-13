package Characters;

import java.util.Random;

public class Enemy
{
	public int xPos = 5;
	public int yPos = 5;
	public int health;
	public int damage;

	public void MoveLeft()
	{
		if (xPos > 0)
		{
			xPos -= 1;
		}
	}

	public void MoveRight()
	{
		if (xPos < 20)
		{
			xPos += 1;
		}
	}

	public void MoveUp()
	{
		if (yPos > 0)
		{
			yPos -= 1;
		}
	}

	public void MoveDown()
	{
		if (yPos < 19)
		{
			yPos += 1;
		}
	}

	Random r = new Random();

	public void AI()
	{
		int temp = -1;
		int tempX = Player.xPos;
		int tempY = Player.yPos;

		if (xPos < tempX)
		{
			temp = 1;
		} else if (xPos > tempX)
		{
			temp = 0;
		} else if (yPos < tempY)
		{
			temp = 3;
		} else if (yPos > tempY)
		{
			temp = 2;
		}

		switch (temp)
		{
		case 0:
			MoveLeft();
			break;
		case 1:
			MoveRight();
			break;
		case 2:
			MoveUp();
			break;
		case 3:
			MoveDown();
			break;
		}

	}
}
