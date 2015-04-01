/*package bbs.gate;

import java.util.*;


public class test01 {
	public static void main(String[] args){
		System.out.println("hello world");
		int number, pin, input1, input2;
		Scanner scan = new Scanner(System.in);
		System.out.println("사용할 논리회로를 설정하세요 : 1. NOT 2. AND 3.OR");
		number = scan.nextInt();
		switch (number) {
		case 1:
		{
			System.out.println("Not 게이트 선택");
			System.out.println("핀 넘버를 입력하세요 : (1, 3, 5, 9, 11, 13)");
			pin = scan.nextInt();
			System.out.println("핀에 넣을 값을 입력하세요 : (0 or 1)");
			input1 = scan.nextInt();
			Not mainNot = new Not(input1, pin);
			break;
		}
		case 2:
		{
			System.out.println("And 게이트 선택");
			System.out.println("핀 넘버를 입력하세요 (두 숫자중 하나만 선택): {(1,2),(4,5), (9,10), (12,13)}");
			pin = scan.nextInt();
			System.out.println("각 핀에 넣을 두 값을 차례로 입력하세요  : (0 or 1)");
			input1 = scan.nextInt();
			input2 = scan.nextInt();
			And mainAnd = new And(input1, input2, pin);
			break;
		}
		case 3:
		{
			System.out.println("Or 게이트 선택");
			System.out.println("핀 넘버를 입력하세요 (두 숫자중 하나만 선택): {(1,2),(4,5), (9,10), (12,13)}");
			pin = scan.nextInt();
			System.out.println("각 핀에 넣을 두 값을 차례로 입력하세요  : (0 or 1)");
			input1 = scan.nextInt();
			input2 = scan.nextInt();
			Or mainOr = new Or(input1, input2, pin);
			break;
		}
	}
	}
}
*/