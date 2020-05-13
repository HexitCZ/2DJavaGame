package Characters;

import Core.Items.Item;

public class Player
{
	public static int xPos;
	public static int yPos;
	public static int health;
	public static int damage;
	public static Item[] items = new Item[10];

	public static void MoveLeft()
	{
		if (xPos > 0)
		{
			xPos -= 1;
		}
	}

	public static void MoveRight()
	{
		if (xPos < 20)
		{
			xPos += 1;
		}
	}

	public static void MoveUp()
	{
		if (yPos > 0)
		{
			yPos -= 1;
		}
	}

	public static void MoveDown()
	{
		if (yPos < 19)
		{
			yPos += 1;
		}
	}
}
