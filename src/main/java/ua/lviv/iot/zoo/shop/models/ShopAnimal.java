package ua.lviv.iot.zoo.shop.models;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
public class ShopAnimal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String name;
	@Column
	private int price;
	@Column
	private KindOfAnimal type;
	@Column
	private String colour;
	@Column
	private int age;
	@Column
	private int weight;
	@Column
	private Sex sex;
	@Column
	private String food;

	public ShopAnimal() {
	}

	public ShopAnimal(final String name, final int price, final KindOfAnimal type, final String colour, final int age,
			final int weight, final Sex sex, final String food) {

		this.name = name;
		this.price = price;
		this.type = type;
		this.colour = colour;
		this.age = age;
		this.weight = weight;
		this.sex = sex;
		this.food = food;
	}

	public final String getName() {
		return name;
	}

	public final void setName(final String name) {
		this.name = name;
	}

	public final int getPrice() {
		return price;
	}

	public final void setPrice(final int price) {
		this.price = price;
	}

	public final KindOfAnimal getType() {
		return type;
	}

	public final void setType(final KindOfAnimal type) {
		this.type = type;
	}

	public final String getColour() {
		return colour;
	}

	public final void setColour(final String colour) {
		this.colour = colour;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(final int age) {
		this.age = age;
	}

	public final int getWeight() {
		return weight;
	}

	public final void setWeight(final int weight) {
		this.weight = weight;
	}

	public final Sex getSex() {
		return sex;
	}

	public final void setSex(final Sex sex) {
		this.sex = sex;
	}

	public final String getFood() {
		return food;
	}

	public final void setFood(final String food) {
		this.food = food;
	}

	@Override
	public String toString() {
		return "AnimalShop [name=" + name + ", price=" + price + ", colour=" + colour + ", age=" + age + "]";
	}

	public String getHeaders() {
		return "name, price, type, colour, age, weight, sex, food";
	}

	public String toCSV() {
		return name + "," + price + "," + type + "," + colour + "," + age + "," + weight + "," + sex + "," + food;
	}
}
