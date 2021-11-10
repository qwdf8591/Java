package LoanN;
public class Loan
{
	private float principal;
	private float tenure;
	private float payable;
	
	public Loan(float principal,float tenure)
	{
		this.principal=principal;
		this.tenure=tenure;
		this.payable=payable;
		if(principal<0.0)
		{
			throw new IllegalArgumentException(
		"principal must be positive!");
		}
		if(tenure<0.0)
		{
			throw new IllegalArgumentException(
		"tenure must be positive!");
		}
	}
	public float get_payable()
	{
		return principal/tenure;
	}
	public float get_tenure()
	{
		return tenure;
	}
	public float get_principal()
	{
		return principal;
	}
	public String toString()
	{
		return String.format("%s %f\n %s %f\n %s %f\n","loan",principal,"tenure",tenure
				,"installment",payable);
	}
}