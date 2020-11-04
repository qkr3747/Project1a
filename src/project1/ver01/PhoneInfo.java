package project1.ver01;

public class PhoneInfo {

	String name;
	String phoneNumber;
	String birthday;
	
	public PhoneInfo(String name, String phone){
		this.name = name;
		this.phoneNumber = phone;
	}
	public PhoneInfo(String name, String phone, String birth) {
		this.name = name;
		this.phoneNumber = phone;
		this.birthday = birth;
	}
	public void showPhoneInfo() {
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ phoneNumber);
		System.out.println("생년월일 : "+(birthday == null ? "입력되지않음" : birthday));
	}
}
