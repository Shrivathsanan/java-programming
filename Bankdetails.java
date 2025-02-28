class Bankdetails{
	private String bank_name;
	private int ifsc;
	private String branch;
	private String name;
	private int account_num;
	
	Bankdetails(String bank_name,int ifsc,String branch,String name,int account_num){
		this.bank_name=bank_name;
		this.ifsc=ifsc;
		this.branch=branch;
		this.name=name;
		this.account_num=account_num;
	}
	
	public String getBank_name()
	{
		return bank_name;
	}
	public int getIfsc() {
		return ifsc;
	}
	public String getBranch(){
	    return branch;	
	}
	public String getName(){
		return name;
	}
	public int getAccount_num(){
		return account_num;
	}
	public void setBank_name(String bank_name) {
		this.bank_name=bank_name;
	}
	public void setIfsc(int ifsc) {
		this.ifsc=ifsc;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setaccount_num(int account_num) {
		this.account_num=account_num;
	}
}