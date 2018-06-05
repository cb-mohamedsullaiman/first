public class Smallespow
{
	public static void main(String args[])
	{
		int x=4,y=60,i=0,mul=1;
		while(mul<=y)  //It works until mul becomes greater than y
		{
			mul=mul*x;   //Increasing the power gradually
			i++;		//Total number of power increase
		}
		System.out.println("The smallest power of "+x+" greater than "+y+" is "+i);
	}
}
