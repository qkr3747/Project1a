package project1;

import project1.ver01.PhoneInfo;

public class PhoneBookVer01 {

	public static void main(String[] args) {
		
		PhoneInfo parkSangHyuk = new PhoneInfo("짱구", "010 1111 1111", "000000");
		parkSangHyuk.showPhoneInfo();
		
		System.out.println();
		
		PhoneInfo leeTaeHoon = new PhoneInfo("철수", "010 2222 2222");
		leeTaeHoon.showPhoneInfo();
	}
}
