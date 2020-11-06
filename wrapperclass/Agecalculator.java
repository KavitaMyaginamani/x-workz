public class Agecalculator
{
public static String Agedefine(int age)
{
System.out.println("agedefine method invoked");
System.out.println("age "+age);
boolean childAge=(age>0 && age<=5);
if(childAge)
{
System.out.println("child");
return "child";
}
if(age>5 && age<=12)
{
System.out.println("kid");
return "kid";
}
if(age>12 && age<=19)
{
System.out.println("Teenage");
return "Teenage";
}
if(age>19 && age<=50)
{
System.out.println("Adult");
return "Adult";
}
if(age>50 && age<=100)
{
System.out.println("old");
return "old";
}
System.out.println("No Match");
return "No-Match";
}
}