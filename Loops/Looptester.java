public class Looptester{
public static void main(String[] show)
{
		System.out.println("invoked main");
		boolean termination=true;
	for(byte start=0;termination;start++)
{
System.out.println("Infinite");
System.out.println("value of infinite variable "+start);
}
if(start==3)
{
termination=false;
}
System.out.println("Exit :: main");
}
}
	