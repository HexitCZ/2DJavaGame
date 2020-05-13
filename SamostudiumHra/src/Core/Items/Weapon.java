package Core.Items;

public class Weapon extends Item
{
	public int damage;

	public Weapon(String name, int price, int damage)
	{
		this.name = name;
		this.price = price;
		this.damage = damage;
	}

	public String toString()
	{
		return name + " Price: " + price + " Damage: " + damage;
	}
}
