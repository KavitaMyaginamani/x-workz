public class Report{
	
	public static void main(String[] marks)
	{
		System.out.println("JVM invoked main");
		
		String marksInString=marks[0];
		
		double percentage=Double.parseDouble(percentage);
		String score=Result.report(percentage);
		System.out.println("performance based on percentage is "+score);
		System.out.println("Exit:: main");
		
	}
}