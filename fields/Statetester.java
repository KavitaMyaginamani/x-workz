public class Statetester{
public static void main(String[] arg)
{
		System.out.println("invoked main");
	System.out.println("State name "+State.stateName);
	int door=State.areaOfState;
	System.out.println("area of State is "+door);
	System.out.println("no of Districts "+State.noOfDistricts);
	System.out.println("Capital city is "+State.capitalCity);
	System.out.println("Exit:: main ");
	
	
	
		System.out.println("*********************************");
		
		
	System.out.println("name of district "+District.districtName);
	int areaValue=District.areaOfDistrict;
	System.out.println("area of distirct is "+areaValue);
	System.out.println("no of taluk "+District.noOfTaluk);
	System.out.println("dirstrict pincode "+District.pinCode);
	
}
}
