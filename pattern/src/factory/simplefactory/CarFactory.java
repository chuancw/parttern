package factory.simplefactory;


/**
 * 简单工厂模式
 * @author Emind
 *
 */
public class CarFactory {
     public static Car createCar(String type){
    	   if("audi".equals(type)){
    		   return new Audi();
    	   }
    	   else if("byd".equals(type)){
    		    return new Byd();
    	   }
    	   else return null;
     }
}
