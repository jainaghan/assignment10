class Car
{
String brand;
String colour;
int price;
void accelerate()
{
System.out.println("a car accelerate");
}}
class CarApp
{
public static void main(String [] args)
{
   Car c=new Car();
      c.brand="maruthi";
      c.colour="red";
      c.price=122000;
  System.out.println("brand :"+c.brand);
  System.out.println("colour :"+c.colour);
  System.out.println("price :"+c.price);
  c.accelerate();
}}