package que53;

//Create product class with id,name,price,qnty and create object with some data and display that data using toString
public class Product {
	private int id;
	private String name;
	private int price;
	private int qanty;

	public static void main(String[] args) {
		Product pro = new Product();
		pro.id = 101;
		pro.name = "Raj";
		pro.price = 9000;
		pro.qanty = 100;
		System.out.println(pro);
	}

	public String toString() {
		return id + " " + name + " " + price + " " + qanty;
	}
}
