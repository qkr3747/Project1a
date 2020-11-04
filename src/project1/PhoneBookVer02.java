package project1;

import java.util.Scanner;

import project1.ver02.PhoneInfo;

public class PhoneBookVer02 {
	
	public static void main(String[] args) {
		
		PhoneInfo info =
				new PhoneInfo(null, null);
		
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {
			
				System.out.println("선택하세요");
				System.out.println("1.데이터 입력");
				System.out.println("2.프로그램종료");
				System.out.print("선택:");
				
				int choice = scan.nextInt();
			
				if(choice==1) {
					info.showPhoneInfo();
				}
				else if(choice==2) {
					System.out.println("프로그램을 종료합니다.");
					return;
				}
				else {
					System.out.printf("%n다시 입력 해주세요.%n%n");
				}
			}
		}
	}
}		
	
	

