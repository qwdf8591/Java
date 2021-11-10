package LoanN;
class HOMELOAN extends Loan
{
	private  double interest=0.01;
	public HOMELOAN(float principal, float tenure)
	{
		super(principal, tenure);
	}
	
	public float get_payable()
	{
		float sum=0;
		double w=1+interest;
		for(int i=0;i<super.get_tenure();i++)
		{
			sum+=w;
		}
		return (float) (super.get_principal()*Math.pow(w,super.get_tenure())/sum);
	}
	@Override
	public String toString()
	{
		return 	String.format("%s %f\n %s %f\n %s %f\n","HOMELoan",super.get_principal(),"tenure",super.get_tenure()
				,"installment",get_payable());
	}
		
}
class VechicleLoan extends Loan
{
	private  double interest=0.01;
	public VechicleLoan(float principal, float tenure)
	{
		super(principal, tenure);
	}
	
	public float get_payable()
	{
		float sum=0;
		double w=1+interest;
		for(int i=0;i<super.get_tenure();i++)
		{
			sum+=w;
		}
		return (float) (super.get_principal()*Math.pow(w,super.get_tenure())/sum);
	}
	@Override
	public String toString()
	{
		return 	String.format("%s %f\n %s %f\n %s %f\n","VechicleLoan",super.get_principal(),"tenure",super.get_tenure()
				,"installment",get_payable());
	}
}
class PersonalLoan extends Loan
{
	private double interest=0.01;
	public PersonalLoan(float principal, float tenure)
	{
		super(principal, tenure);
	}
	public float get_payable()
	{
		float sum=0;
		double w=1+interest;
		for(int i=0;i<super.get_tenure();i++)
		{
			sum+=w;
		}
		return (float) (super.get_principal()*Math.pow(w,super.get_tenure())/sum);
	}
	@Override
	public String toString()
	{
		return 	String.format("%s %f\n %s %f\n %s %f\n","PersonalLoan",super.get_principal(),"tenure",super.get_tenure()
				,"installment",get_payable());
	}
}