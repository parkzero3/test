package Ifexample;

import java.util.Scanner;

public class SwitchCaseEx {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int rank = scan.nextInt();
		char medalColor;
		
		switch (rank) {
		case 1: medalColor = 'G';
			System.out.println("�ݸ޴�");
			break;
		case 2: medalColor = 'S';
			break;
		case 3: medalColor = 'B';
			break;
		default : medalColor = 'A';
		}
		System.out.println(rank + "����" + medalColor + "�޴� �Դϴ�.");
	}
}
