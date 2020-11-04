package project1.ver04;

public class PhoneInfo {

	String name;
	String phoneNumber;
	
	public PhoneInfo(String name, String phone){
		this.name = name;
		this.phoneNumber = phone;
	}
	
	public void dataAllShow() {
		System.out.println("name:"+ name);
		System.out.println("phone:"+ phoneNumber);
	}
	
}