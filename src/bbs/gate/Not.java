package bbs.gate;

public class Not {
	int input, output;
	int outpinnum;
	public Not(int in, int pinnum){
		input = in;
		if(pinnum < 7)
			outpinnum = pinnum + 1;
		else if(pinnum > 7)
			outpinnum = pinnum - 1;
		if (input == 1)
		{
			output = 0;
		}
		else if(input == 0)
		{
			output = 1;
		}
		else
		{
			System.out.println("illegal input number");
		}
		System.out.println("출력 핀 넘버 : " + outpinnum +  " 출력 값 : " + output);
	}
	
}
