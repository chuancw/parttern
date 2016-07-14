package factory.simplefactory;


public class Client {
     public static void main(String[] args) {
		  Car audi=CarFactory.createCar("audi");
		  Car byd=CarFactory.createCar("byd");
		  audi.run();
		  byd.run();
	}
}
