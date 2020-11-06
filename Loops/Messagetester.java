public class Messagetester{

public static void main(String[] msgs)
{
System.out.println("invoked main");
String valueAtIndex0=msgs[0];
int number=Integer.parseInt(valueAtIndex0);
Vtu.printMessage(number);

System.out.println("**********************");
Vtu.groupMessagesAndLoop();
System.out.println("Exit:: main");
}
}


