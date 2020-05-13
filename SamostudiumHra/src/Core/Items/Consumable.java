package Core.Items;

public class Consumable extends Item
{
	public enum Type
	{
		Potion, Food
	}

	public Type consumableType;

	public Consumable(String name, int price, Type cType)
	{
		this.name = name;
		this.price = price;
		consumableType = cType;
	}

	public String toString()
	{
		return name + " Price: " + price + " Type: " + consumableType;
	}

}
