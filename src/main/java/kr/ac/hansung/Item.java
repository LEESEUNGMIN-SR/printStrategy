package kr.ac.hansung;

public class Item {

	private String name;
	private int price;
	
	
	
	public Item(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
