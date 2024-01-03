package oops.polymorphism;

//package OOP's Concept.polymorphism;
class Plane
{
 public void takeoff()
 {
     System.out.println("plane is taking off");
 }
 public void landing()
 {
     System.out.println("plane is landing");
 }
 public void fly()
 {
     System.out.println("plane is flying");
 }
}

class PassengerPlane extends Plane
{
 public void fly()
 {
     System.out.println("Passenger plane flies at medium height");
 }
}
class CargoPlane extends Plane
{
 public void fly()
 {
     System.out.println("CargoPlane files at lower height");
 }
}
class FighterPlane extends Plane
{
 public void fly()
 {
     System.out.println("Fighterlane files at higher height");
     shoot();
 }
 public void shoot()
 {
	 System.out.println("Shooting:-------");
 }
}
class Airport
{
 public void permit(Plane plane)
 {
     plane.takeoff();
     plane.fly();
     plane.landing();
 }
}
public class TestPlane {
 public static void main(String[] args) {
     CargoPlane cp = new CargoPlane();
     PassengerPlane pp = new PassengerPlane();
     FighterPlane fp = new FighterPlane();

     Airport air = new Airport();
     air.permit(cp);
     air.permit(pp);
     air.permit(fp);
   
 }
}
