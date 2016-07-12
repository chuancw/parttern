package singleton;

import java.lang.reflect.Constructor;

/**
 * 破解单例
 * @author Emind
 *
 */
public class Client2 {
      public static void main(String[] args) throws Exception{
		  SingletonDemoFX s1=SingletonDemoFX.getInstance();
		  SingletonDemoFX s2=SingletonDemoFX.getInstance();
		  System.out.println(s1==s2);
		  
		  //通过反射直接调用私有构造器来创建对象。
		  Class<SingletonDemoFX> clazz=(Class<SingletonDemoFX>) Class.forName("singleton.SingletonDemoFX");
		  Constructor<SingletonDemoFX> c=clazz.getDeclaredConstructor(null);
		  c.setAccessible(true);
		  SingletonDemoFX a1=c.newInstance();
		  SingletonDemoFX a2=c.newInstance();
		  System.out.println(a1==a2);
		  
		  
		  	  
	}
}
