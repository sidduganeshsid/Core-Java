package oops.abstraction;


/**
 * Author : sidduganesh 
 */
abstract class Plane
{
 abstract public void takeoff();
 abstract public void landing();
 abstract public void fly();

}

class PassengerPlane extends Plane
{
	 public void fly()
	 {
	     System.out.println("Passenger plane flies at medium height");
	 }
	 public void landing()
	 {
		 System.out.println("Passenger Plane is landing");
	 }
	@Override
	public void takeoff() {
		System.out.println("Passenger plane is taking off");
	}
	
}

class CargoPlane extends Plane
{
 public void fly()
 {
     System.out.println("CargoPlane files at lower height");
 }

@Override
public void takeoff() {
	// TODO Auto-generated method stub
	
}

@Override
public void landing() {
	// TODO Auto-generated method stub
	
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
@Override
public void takeoff() {
	// TODO Auto-generated method stub
	
}
@Override
public void landing() {
	// TODO Auto-generated method stub
	
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
public class TestPlane2 {
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

