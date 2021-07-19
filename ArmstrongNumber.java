package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int armnumber = 371;
		int result = 0;
		int remainder ,original, quotient;
		original = armnumber;
		System.out.println("Input number:"+armnumber);
		while(armnumber>0) {
			
			remainder = armnumber%10;
			quotient= armnumber/10;
			result = result + (remainder*remainder*remainder);
			armnumber = quotient;
			
			
		}
if(original==result)

{
	
System.out.println("num is armsstrong");	
	
}
else
{
System.out.println("its not a armstrong number");	
}
	}

}
