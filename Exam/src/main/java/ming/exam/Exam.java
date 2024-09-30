
package ming.exam;

public class Exam
{
	public static void main (String [] args)
	{
		int a=75, b=68, c=24, d=76, Av2, Av3, Av4;
		Exam testAv = new Exam();
		Av2 = testAv.average(a,b);           
		System.out.println("Av2 : "+ Av2);
		Av3 = testAv.average(a,b,c);
		System.out.println("Av3 : "+ Av3);
                Av4 = testAv.average(a,b,c,d);
		System.out.println("Av4 : "+ Av4);
	}
	int average (int i, int j)
	{
		return (i+j)/2;
	}
	
	int average (int i, int j, int k)
	{
		return (i+j+k)/3;
	}
        
        int average (int i, int j, int k,int l)
	{
		return (i+j+k+l)/4;
	}
}

