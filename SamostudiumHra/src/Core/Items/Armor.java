package Core.Items;

public class Armor extends Item
{
	public int health;

	public Armor(String name, int price, int health)
	{
		this.name = name;
		this.price = price;
		this.health = health;
	}

	public String toString()
	{
		return name + " Price: " + price + " Health: " + health;
	}
}
