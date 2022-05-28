package week3day1;

public class Calculator {
	
	
			public int add(int num1,int num2)
		{
		int sumresult=num1+num2;
		System.out.println(sumresult);
		return sumresult;
		
	}
	public int add1(int num1,int num2,int num3)
	{
		int sumresult1=num1+num2+num3;
		System.out.println(sumresult1);
		return sumresult1;
		
	}
	public int sub(int num1,int num2)
	{
		int subresult=num1-num2;
		System.out.println(subresult);
		return subresult;
	}
	public double sub1(double data1,double data2)
	{
		double subresult1=data1-data2;
		System.out.println(subresult1);
		return subresult1;
	}
	public int mul(int num1,int num2)
	{
		int mulresult=num1*num2;
		System.out.println(mulresult);
		return mulresult;

		
	}
	public double mul1(double data1,int num2)
	{
		double mulresult1=data1*num2;
		System.out.println(mulresult1);
		return mulresult1;

	}
	
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		System.out.println(calc.add(1,2));
		System.out.println(calc.add1(1,2,3));
		System.out.println(calc.sub(1,2));
		System.out.println(calc.sub1(2.2,3.3));
		System.out.println(calc.mul(1,2));
		System.out.println(calc.mul1(2.2,2));


	}

}
