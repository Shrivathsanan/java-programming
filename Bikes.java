class Bikes{
	public static void main(String args[]) {
		Bike user = new Bike("yamaha","R15",200000,"black",149.94);
		System.out.println(user.getBrand()  +" "+ user.getModel() + " "+ user.getPrice() + " "+ user.getColour() + " "+ user.getCc());
		user.setBrand("honda");
		user.setModel("CBR150R");
		user.setPrice(190000);
		user.setColour("Mettalic Black");
		user.setCc(149.0);
		System.out.println("\n After setting different values");
		System.out.println("\n"+user.getBrand()  +" "+ user.getModel() + " "+ user.getPrice() + " "+ user.getColour() + " "+ user.getCc());
	}
}