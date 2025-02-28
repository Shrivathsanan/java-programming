import java.util.*;

class Laptop{
	private String brand;
	private String model;
	private int price;
	private int version;
	Laptop(String brand,String model,int price,int version){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.version=version;
	}
	Laptop(){
		
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public int getVersion() {
		return version;
	}
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setVersion(int version) {
		this.version=version;
	}
}