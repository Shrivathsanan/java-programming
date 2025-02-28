class Bank{
	public static void main(String args[]) {
		Bankdetails customer = new Bankdetails("SBI",9005,"Koyambedu","Raju",2442567);
		System.out.println(customer.getBank_name()  +" "+ customer.getIfsc() + " "+ customer.getBranch() + " "+ customer.getName() + " "+ customer.getAccount_num());
		customer.setBank_name("RBI");
		customer.setIfsc(9006);
		customer.setBranch("perungudi");
		customer.setName("Raju bhai");
		customer.setaccount_num(2442345);
		System.out.println("\n After setting different values");
		System.out.println("\n"+ customer.getBank_name()  +" "+ customer.getIfsc() + " "+ customer.getBranch() + " "+ customer.getName() + " "+ customer.getAccount_num());
	}
}