package LoanN;
import java.util.Scanner;
public class LoanTest
{
	public static void main(String[] agrs)
	{
		Scanner input=new Scanner(System.in);
		float a,b,c,d,e,f,g=0;
		System.out.println("principal for homeloan:");
		a=input.nextFloat();
		System.out.println("tenure for homeloan:");
		b=input.nextFloat();
		System.out.println("principal for VechicleLoan:");
		c=input.nextFloat();
		System.out.println("tenure for VechicleLoan:");
		d=input.nextFloat();
		System.out.println("principal for PersonalLoan:");
		e=input.nextFloat();
		System.out.println("tenure for PersonalLoan:");
		f=input.nextFloat();
		
		HOMELOAN homeloan=new HOMELOAN(a,b);
		VechicleLoan loan=new VechicleLoan(c,d);
		PersonalLoan ploan=new PersonalLoan(e,f);
		
		System.out.printf("%s",homeloan.toString());
		System.out.printf("%s",loan.toString());
		System.out.printf("%s",ploan.toString());
		
	}
}