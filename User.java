class User{
	
	private String name;
	private String email;
	private int phone_no;
	private int pin;

	User(String name,String email,int phone_no,int pin){
		this.name=name;
		this.email=email;
		this.phone_no=phone_no;
		this.pin=pin;
	}
	User(){
		
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public int getPin() {
		return pin;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}

	
	
	
}