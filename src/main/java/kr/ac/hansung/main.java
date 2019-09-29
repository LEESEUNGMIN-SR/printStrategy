package kr.ac.hansung;

import java.io.StringBufferInputStream;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item1 = new Item("Jelly1");
		item1.setPrice(5000);
		
		Item item2 = new Item("Jelly2");
		item2.setPrice(7000);
				
		Receipt r = new Receipt();
		r.addItem(item1);
		r.addItem(item2);
		
		FakePrinter fake = new FakePrinter();
		
		r.setPrinter(fake);
		fake.setContents(r.print());
		System.out.println(fake.getContents());
		if(fake.getContents().equals("Jelly15000Jelly27000"))
			System.out.println("Success");
	}

}
