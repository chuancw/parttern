package factory.factory;

public class BydFactory implements CarFactory {

	@Override
	public Car createCar() {
	   return new Byd();
	}
     
}
