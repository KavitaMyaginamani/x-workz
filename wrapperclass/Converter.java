public class Converter{
	
	public static void main(String[] values)
	{
		System.out.println("Jvm invoked main");
		System.out.println("The [program will convert string to number");
	
	String doorNo="562";
	short converteddoorNo=Short.parseShort(doorNo);
	System.out.println("converted short: "+converteddoorNo);

	
	String salary="85300";
	int convertedsalary=Integer.parseInt(salary);
	System.out.println("converted salary: "+convertedsalary);

	
    int adddoorNoAndsalary=converteddoorNo+convertedsalary;
	System.out.println("adddoorNoAndsalary: "+adddoorNoAndsalary);
    
	
	System.out.println("Exit:: main");
	}

}