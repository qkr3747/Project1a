package project1.ver04;

public class PhoneCompanyInfo extends PhoneInfo {

	String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	public void dataAllShow() {
	System.out.println("name:"+ name);
	System.out.println("phone:"+ phoneNumber);
	System.out.println("company:"+ company);
	}
}

	

