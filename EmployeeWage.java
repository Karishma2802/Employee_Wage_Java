public class EmployeeWage
{
	public static void main(String[] args)
	{
		int fullTime=1;
		int empHrs=0;
		int empRatePerHr=20;
		int salary=0;
		int Result=(int)(Math.random()*10)%2;

		System.out.println("Result= " +Result);

		if(Result == fullTime)
		{
			empHrs=8;
		}
		else
		{
			salary=0;
		}

		salary=(empHrs*empRatePerHr);
		System.out.println("Salary is "+salary);
		}
}
