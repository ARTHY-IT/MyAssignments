package week1.day1;

public class Mobile {

	public void makeCall() {
		String mobileModel= "ASUS ZENFONE";
		Float mobileWeight= 50.1f;
		System.out.println("My mobile model is "+ mobileModel );
		System.out.println("My mobile weight is "+ mobileWeight );
	}
	public void sendMsg() {
		boolean isFullCharged = true;
		int mobileCost= 15000;
		System.out.println(isFullCharged);
		System.out.println("My mobile's price in Chennai is : "+ mobileCost );
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mb = new Mobile();
		mb.makeCall();
		mb.sendMsg();
		System.out.println("This is my mobile");
	}

}
