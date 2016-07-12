package singleton;
/**
 * 懒汉式(如何防止反射和反序列化破解单例)
 * @author Emind
 *
 */
public class SingletonDemoFX {
      private static SingletonDemoFX s;
      private SingletonDemoFX(){
    	  //防止被反射破解单例
    	  //相当于第二次调用的时候做一个检查。
    	  if(s!=null){
    		  throw new RuntimeException();
    	  }
      }
      public static synchronized SingletonDemoFX getInstance(){
    	  if(s==null){
    		  s=new SingletonDemoFX();
    	  }
    	  return s;
      }
}
