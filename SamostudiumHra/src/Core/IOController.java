package Core;

import Characters.Player;

public class IOController
{

	public static void Input(String input)
	{

		switch (input)
		{

		case "a":
			Player.MoveLeft();
			break;
		case "d":
			Player.MoveRight();
			break;
		case "w":
			Player.MoveUp();
			break;
		case "s":
			Player.MoveDown();
			break;
		case "r":
			Graphics.ResetMap();
			Player.xPos = 0;
			Player.yPos = 0;
			break;
		case "p":
			Main.gameIsRunning = false;
			System.out.println("Game was stopped by player");
			break;
		}

	}

}
