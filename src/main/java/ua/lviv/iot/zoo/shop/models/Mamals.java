package ua.lviv.iot.zoo.shop.models;

public class Mamals extends ShopAnimal {

	private AnimalWoolType wool;

	public Mamals() {
		super();
	}

	public Mamals(final String name, final int price, final KindOfAnimal type, final String colour, final int age,
			final int weight, final Sex sex, final String food, AnimalWoolType wool) {
		super(name, price, type, colour, age, weight, sex, food);

	}

	public Mamals(final AnimalWoolType wool) {
		super();
		this.wool = wool;
	}

	public final AnimalWoolType getWool() {
		return wool;
	}

	public final void setWool(final AnimalWoolType wool) {
		this.wool = wool;
	}

	@Override
	public String toString() {
		return "Mamals [" + super.toString() + ",wool=" + wool + "]";
	}

	public String getHeaders() {
		return super.getHeaders() + "," + "wool";
	}

	public String toCSV() {
		return super.toCSV() + wool;
	}

}
