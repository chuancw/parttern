package template;

public class Client {
     public static void main(String[] args) {
		  BankTemplateMethod b=new GetMoney();
		  b.process();
	}
}

class GetMoney extends BankTemplateMethod{

	@Override
	public void transact() {
		System.out.println("我要取款....");
		
	}
	 
}
