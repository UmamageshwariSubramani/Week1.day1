package Week1.day1;

public class MobileValidation {
	
	public void makecall() {
		System.out.println("makecall");
	}
  
	public void sendmsg() {
		System.out.println("sendmsg");
	}
	
	public void rejectedcalls() {
		System.out.println("rejectedcalls");
	}
	
	public static void main(String[] args) {
		MobileValidation calls = new MobileValidation();
		calls.makecall();
		calls.sendmsg();
		calls.rejectedcalls();
		

	}

}
