public class Carbrands{
public static String[] getBrands()
{
System.out.println("getBrands method invoked");
String[] carBrands={"Maruti suzuki","Toyota","BMW","Audi","Nano"};
System.out.println("brands size "+carBrands.length);
for(int brands=0;brands<carBrands.length;brands++)
{
System.out.println("Brands count "+brands);
String message=carBrands[brands];
System.out.println("car Brands "+message);
}
return carBrands;
}
}