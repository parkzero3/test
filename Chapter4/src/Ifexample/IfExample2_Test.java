package Ifexample;

import java.util.Scanner;

public class IfExample2_Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int point = scan.nextInt();
		
		if(point >= 90 && point <= 100) {
			System.out.println(" A ����Դϴ�.");
		}
		else if(point >= 80 && point <=89) {
			System.out.println(" B ����Դϴ�.");
		}
		else if(point >= 70 && point <=79) {
			System.out.println(" C ����Դϴ�.");
		}
		else if(point >= 60 && point <=69) {
			System.out.println(" D ����Դϴ�.");
		}else {
			System.out.println(" F ����Դϴ�.");
		}

	}

}
