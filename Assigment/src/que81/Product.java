package que81;

import java.util.HashSet;
import java.util.Objects;



class Product{
String name;
int price;
int quantity;
public Product(String name,int price,int quantity){
	this.name=name;
	this.price=price;
	this.quantity=quantity;
}
//do required changes in Product class
@Override
	public String toString() {
		return name+" "+price+" "+quantity;
	}
@Override
public int hashCode() { // here override the all method beacuse it is custom
						// class i.e all method are override 
	return Objects.hash(name, price, quantity);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	Product other = (Product) obj;
	return name == other.name && Objects.equals(price, other.price) && quantity == other.quantity;
}

public static void main(String[] args) {
	Product p1=new Product("chai",1000,10);
	Product p2=new Product("Choklet",500,20);
	Product p3=new Product("cake",200,10);
	Product p4=new Product("chai",1000,10);
	
//Now create HashSet of Product and make sure duplicates are not there
	HashSet<Product> h=new HashSet<>();
	h.add(p1);
	h.add(p2);
	h.add(p3);
	h.add(p4);
	System.out.println(h);
}

}


