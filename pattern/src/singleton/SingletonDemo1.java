package singleton;
/**
 * 饿汉式
 * @author Emind
 *
 */
public class SingletonDemo1 {
       private static SingletonDemo1 s=new SingletonDemo1();
       private SingletonDemo1(){}
       public static SingletonDemo1 getInstance(){
    	    return s;
       }
}
