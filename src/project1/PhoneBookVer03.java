package project1;

import java.util.Scanner;

import project1.ver03.PhoneInfo;
import project1.ver03.PhoneBookManager;

public class PhoneBookVer03 {
	
	public static void printMenu() {
		
		System.out.println("선택하세요");
		System.out.println("1.데이터 입력");
		System.out.println("2.데이터 검색");
		System.out.println("3.데이터 삭제");
		System.out.println("4.주소록 출력");
		System.out.println("5.프로그램종료");
		System.out.print("선택:");
	}
	public static void main(String[] args) {
		PhoneBookManager info = 
				new PhoneBookManager(100);
		
		while(true) {
		
			printMenu();
			
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			switch(choice) {			
			
			case 1:
				info.dataInput();
				break;
			case 2:
				info.dataSearch();
				break;
			case 3:
				info.dataDelete();
				break;
			case 4:
				info.dataAllShow();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return; 
			}
		}
	}

}
