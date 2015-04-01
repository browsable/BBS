package bbs.gate;

public class Or {
	int input1, input2, output;
	int outpinnum;
	
	public Or(int in1, int in2, int pinnum){
		input1 = in1;
		input2 = in2;
		if (pinnum < 7 && pinnum % 3 == 1)
		{
			outpinnum = pinnum + 2;
			
		}
		else if (pinnum < 7 && pinnum % 3 == 2)
		{
			outpinnum = pinnum + 1;
		}
		else if (pinnum > 7 && pinnum % 3 == 0)
		{
			outpinnum = pinnum - 1;
		}
		else if (pinnum > 7 && pinnum % 3 == 1)
		{
			outpinnum = pinnum - 2;
		}
		else
		{
			System.out.print("illegal pin number ");
		}
		if(pinnum > 0 && pinnum < 14)
		{
			if(in1 + in2 != 2)
			{
				output = in1 + in2;
			}
			else if(in1 == 1 && in2 == 1)
			{
				output = 1;
			}
			if(output == 1 || output == 0){
				System.out.println("출력 핀 넘버 : " + outpinnum + " 출력 값 : " + output);
			}
			else
			{
				System.out.println("illegal input number");
			}
		}
	}
}