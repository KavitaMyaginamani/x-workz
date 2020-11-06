public class Agetester{
public static void main(String[] person)
{
System.out.println("JVM invoked main");
String ageInString=person[0];
byte age=Byte.parseByte(ageInString);
String ageValue=Agecalculator.ageDefine(age);
System.out.println("The person with this age is "+ageValue);
System.out.println("Exit:: main");
}

}