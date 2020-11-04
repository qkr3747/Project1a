package project1.ver04;

public class PhoneSchoolInfo extends PhoneInfo {

	String major;
	int grade;
	
	public PhoneSchoolInfo(String name, 
			String phoneNumber, String major, int grade) {
		super(name, phoneNumber);
		this.major = major;
		this.grade = grade;

	}
	public void dataAllShow() {
		System.out.println("name:"+ name);
		System.out.println("phone:"+ phoneNumber);
		System.out.println("major:"+ major);
		System.out.println("grade:"+ grade);
	}
}