package Core;

import Characters.Enemy;
import UI.Window;

public class Graphics
{
	public static int[][] GameMap = new int[20][20];

	public static void ResetMap()
	{
		for (int i = 0; i < 20; i++)
		{
			for (int j = 0; j < 19; j++)
			{
				GameMap[i][j] = 0;
			}
		}
	}

	public static void DrawMap(int playerX, int playerY, Enemy[] enemies)
	{
		int enemyX = enemies[0].xPos;
		int enemyY = enemies[0].yPos;
		GameMap[enemyX][enemyY] = 2;

		System.out.println();
		int tempX = 0, tempY = 0;
		boolean drawing = true;
		if (playerX < 20 && playerY < 20)
		{
			GameMap[playerX][playerY] = 1;
			System.out.println(playerX + " " + playerY);
			while (drawing)
			{
				if (tempX < 20)
				{
					// System.out.print(IntToString(tempX, tempY));
					Window.mapToRender.append(IntToString(tempX, tempY));
					tempX += 1;
				} else if (tempY < 19)
				{
					Window.mapToRender.append("\n");
					tempY += 1;
					tempX = 0;
				} else
					drawing = false;

			}
			GameMap[playerX][playerY] = 0;
			GameMap[enemyX][enemyY] = 0;
		}
		// Window.mapToRender.append("</html>");

	}

	private static String IntToString(int x, int y)
	{
		if (GameMap[x][y] == 0)
			return "0";
		else if (GameMap[x][y] == 1)
			return "P";
		else if (GameMap[x][y] == 2)
			return "E";
		return "";

	}
}
