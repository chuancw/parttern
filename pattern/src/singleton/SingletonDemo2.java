package singleton;
/**
 * 懒汉式
 * @author Emind
 *
 */
public class SingletonDemo2 {
      private static SingletonDemo2 s;
      private SingletonDemo2(){}
      public static synchronized SingletonDemo2 getInstance(){
    	  if(s==null){
    		  s=new SingletonDemo2();
    	  }
    	  return s;
      }
}
