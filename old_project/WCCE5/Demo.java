class Demo 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=11;
		int c=8;
		int d=28;
		int e=18;

		
		
		int temp = ((a>b)? (a>c)?  a: c		: (b>c)? b:c);
		
		int temp2 = ((d>e)? d:e);
		
		int result = ((temp>temp2)?  temp : temp2);
	
		System.out.println(result);
	}
}
