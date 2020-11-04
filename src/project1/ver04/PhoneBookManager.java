package project1.ver04;

import java.util.Scanner;

public class PhoneBookManager {

	Scanner scan = new Scanner(System.in);
	String iName;
	String iPhone;
	String iMajor;
	String iCompany;
	int iGrade;

	private PhoneInfo[] myInfos;
	private int numOfInfos;
	
	public PhoneBookManager(int num) {
 		myInfos = new PhoneInfo[num];
		numOfInfos = 0;
	}
	public void dataInput(int choice) {
		
		
		System.out.print("이름:");iName = scan.nextLine();
		System.out.print("전화번호:");iPhone = scan.nextLine();
		
		if(choice==1) {	
			
			PhoneInfo info =
					new PhoneInfo(iName, iPhone);
			myInfos[numOfInfos++] = info;
		}
		else if(choice==2) {
			
			System.out.print("전공:"); iMajor = scan.nextLine();
			System.out.print("학년:"); iGrade = scan.nextInt();
			scan.nextLine();
			
			PhoneSchoolInfo school = 
					new PhoneSchoolInfo(iName, iPhone, iMajor, iGrade);
			
			myInfos[numOfInfos++] = school;
		}
		else if(choice==3) {
			
			System.out.print("회사:"); iCompany = scan.nextLine();
			
			PhoneCompanyInfo company =
					new PhoneCompanyInfo(iName, iPhone, iCompany);
			
			myInfos[numOfInfos++] = company;
		}
		
		System.out.println("데이터 입력이 완료되었습니다.");
		System.out.println();
	}
	
	public void dataSearch() {
		
		boolean isFind = false;
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름:");iName = scan.nextLine();
		
		for(int i=0 ; i<numOfInfos ; i++) {			
					
			if(iName.compareTo(myInfos[i].name)==0) {
				myInfos[i].dataAllShow();
				System.out.println("데이터 검색이 완료되었습니다.");
				isFind = true;
			}
		}
		
		if(isFind==false)
		System.out.println("찾는 정보가 없습니다.");
		System.out.println();
		
	}
	public void dataDelete() {
		
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.printf("이름:");
		String deleteName = scan.nextLine();
		
		int deleteIndex = -1;
		
		for(int i=0 ; i<numOfInfos ; i++) {
			if(deleteName.compareTo(myInfos[i].name)==0) {
				myInfos[i] = null;
				deleteIndex = i;
				numOfInfos--;
			}
		}
		if(deleteIndex==-1) {
			
			System.out.println("삭제된 데이터가 없습니다");
			System.out.println();
		}
		else {
			
			for(int i=deleteIndex ; i<numOfInfos ; i++) {
				myInfos[i] = myInfos[i+1];
			}
			System.out.println("데이터 삭제가 완료되었습니다.");
			System.out.println();
		}
	}
	public void dataAllShow() {
		for(int i=0 ; i<numOfInfos ; i++) {
			myInfos[i].dataAllShow();
		}
		System.out.println("전체정보가 출력되었습니다");
		System.out.println();
	}

}
