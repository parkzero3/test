package Ifexample;

import java.util.Scanner;

public class IfExample2_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int point = scan.nextInt();
		
		if(point >= 90 && point <= 100) {
			System.out.println(" A 등급입니다.");
		}
		else if(point >= 80 && point <=89) {
			System.out.println(" B 등급입니다.");
		}
		else if(point >= 70 && point <=79) {
			System.out.println(" C 등급입니다.");
		}
		else if(point >= 60 && point <=69) {
			System.out.println(" D 등급입니다.");
		}else {
			System.out.println(" F 등급입니다.");
		}

	}

}
