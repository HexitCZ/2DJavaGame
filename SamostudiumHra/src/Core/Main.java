package Core;

import java.util.Scanner;
import javax.swing.JFrame;
import Characters.Enemy;
import Characters.Player;
import Core.Items.Item;
import Core.Items.Weapon;
import UI.Window;

public class Main
{

	public static boolean gameIsRunning = true;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		Enemy[] enemies = new Enemy[1];
		Enemy enemyOne = new Enemy();
		enemies[0] = enemyOne;

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setSize(300, 370);
		Item i = new Weapon("Sword", 10, 5);
		Player.items[0] = i;
		System.out.println(Player.items[0]);

		frame.add(Window.txt);
		Window.txt.setAlignmentX(225);

		frame.setVisible(true);
		while (gameIsRunning)
		{
			Graphics.DrawMap(Player.xPos, Player.yPos, enemies);
			enemyOne.AI();
			Window.RenderMap();
			Window.mapToRender.delete(0, Window.mapToRender.length());
			IOController.Input(sc.nextLine());
		}

	}

}
