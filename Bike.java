class Bike{
	private String brand;
	private String model;
	private int price;
	private String colour;
	private double cc;
	
	Bike(String brand,String model,int price,String colour,double cc){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.colour=colour;
		this.cc=cc;
	}
	
	public String getBrand()
	{
		return brand;
	}
	public String getModel() {
		return model;
	}
	public int getPrice(){
	    return price;	
	}
	public String getColour(){
		return colour;
	}
	public double getCc(){
		return cc;
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
	public void setColour(String colour) {
		this.colour=colour;
	}
	public void setCc(double cc) {
		this.cc=cc;
	}
}

