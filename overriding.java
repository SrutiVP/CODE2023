import.java.util.*;
class animal()
{
 void eat()
 {
  System.out.println("Drinking water");
  System.out.println("eating");
 }
}
class Dog extends Animal()
{
 void eat()
 {
 System.out.println("Dog food");
 System.out.println("Dog is eating");
 }
}
class overriding
{
 public static void main(String args[])
 {
  Dod d1=new Dod();
  Animal a1=new Animal();
  
  d1.eat();
  a1.eat();
  
  Animal animal=new Dod();
  animal.eat();
 }
}