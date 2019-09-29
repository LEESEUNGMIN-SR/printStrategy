package kr.ac.hansung;
import java.util.List;
import java.util.ArrayList;

public class Receipt {
	private List<Item> items = new ArrayList<Item>();
	private Printer printer;
	
	public String print() {
		StringBuffer buf =new StringBuffer();
		for(Item i : items) {
			buf.append(i.getName());
			buf.append(i.getPrice());
		}
		return buf.toString();
	}
	public void addItem(Item item) {
		items.add(item);
	}

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public List<Item> getItems() {
		return items;
	}
}
