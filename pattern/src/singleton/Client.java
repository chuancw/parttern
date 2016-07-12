package singleton;

public class Client {
       public static void main(String[] args) {
		    SingletonDemo1 s1=SingletonDemo1.getInstance();
		    SingletonDemo1 s2=SingletonDemo1.getInstance();
		    System.out.println(s1==s2);
	}
}
