public class Wrapper{

public static void main(String[] values)
{
	System.out.println("JVM invoked main");
	System.out.println("The program will convert string to number");
	
	String pageNo="720";
	short convertedPageNo=Short.parseShort(pageNo);
	System.out.println("converted short: "+convertedPageNo);
	
	String income="9000";
	int convertedIncome=Integer.parseInt(income);
	System.out.println("converted salary: "+convertedIncome);

	String keyBoardKeys="101";
	byte convertedkeyBoardKeys=Byte.parseByte(keyBoardKeys);
	System.out.println("converted keyBoardKeys: "+convertedkeyBoardKeys);

	String populationOfIndia="1380004385";
	long convertedpopulationOfIndia=Long.parseLong(populationOfIndia);
	System.out.println("converted populationOfIndia: "+convertedpopulationOfIndia);

	String percentageOfStudent="93.6";
	float convertedpercentageOfStudent=Float.parseFloat(percentageOfStudent);
	System.out.println("converted percentageOfStudent: "+convertedpercentageOfStudent);

	
	String chargeOfElectron="1.6e-19";
	double convertedchargeOfElectron=Double.parseDouble(chargeOfElectron);
	System.out.println("converted chargeOfElectron: "+convertedchargeOfElectron);

	
	String starIsPlanet="false";
	boolean convertedstarIsPlanet=Boolean.parseBoolean(starIsPlanet);
	System.out.println("converted starIsPlanet: "+convertedstarIsPlanet);

	
	System.out.println("Exit:: main");

}
}