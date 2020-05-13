package Core;

import Characters.Player;
import Core.Items.Item;

public class Economy
{
	public static int playerMoney;

	public static void Buy(Item item)
	{
		if (playerMoney > item.price)
		{
			Player.items[0] = item;
		}

	}

	public static void Sell(Item item)
	{
		Player.items[0] = null;
		playerMoney += item.price;
	}

}
