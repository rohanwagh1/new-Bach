package que1;

import javax.swing.plaf.synth.SynthStyle;

public class Product {
	// Create Product class with fields id,name and price and
	private int id;
	private String name;
	private float price;

	// create Product object and store data and display that data.
	public static void main(String[] args) {
		Product p = new Product();
		p.id = 1;
		p.name = "raj";
		p.price = 5.12f;
		System.out.println(p.id + " " + "  " + p.name + " " + p.price);
	}

}
