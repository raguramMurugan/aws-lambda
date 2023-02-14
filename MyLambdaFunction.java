package mylamda;


interface Maths{
	//void sum(int a);
	int subtraction(int a, int b);
}

public class MyLambdaFunction {
	public static void main(String[] args) {
		
		/*Maths maths=(input) -> 	System.out.println("Sum is:"+input);
		
		maths.sum(12);*/	
		
		Maths maths=(s1,s2) -> 
		{
			if(s2<s1)
			{
				throw new RuntimeException("S2 is Less");
				
			}else {
				return s2-s1;
			}
		};
		System.out.println("Subtraction is :"+maths.subtraction(90, 150));
		
		
	}

}
