public class Vtu {
 public static void printMessage()
 {
	 for(byte msg=0;msg<=4;msg++)
	 {
 System.out.println("Shaping the future");
	 }
 }
	  public static void printMessage(int loopSize)
	  {
		  for(byte msg=0;msg<=loopSize;msg++)
		  {
			  System.out.println("Shaping the future "+msg);
		  }
}
 
 
 public static void groupMessagesAndLoop()
 {
	 System.out.println("invoked groupMessagesAndLoop");
	 String[] messages={"Good Morning","Updates are available","Memory is full","Shut down the system","Battery is full" };
	 
	 System.out.println("messages size "+messages.length);
	 for(int count=0;count<=messages.length;count++)
		
	 {
	 System.out.println("count "+count);
	 String message=messages[count];
	 System.out.println("message "+message);
 }
 }
}