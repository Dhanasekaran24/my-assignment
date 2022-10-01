package week1day1;

public class Mobile {
	public void makecall(String mobileModel, float mobileWeight) {
		System.out.println("model-> "+ mobileModel);
		System.out.println("weight(grams)-> " + mobileWeight);
	}
    public void sendmsg(boolean isFullyCharged, int mobileCost) {
    	System.out.println("is fully charged ->" + isFullyCharged);
    	System.out.println("cost(rupees)-> "+ mobileCost);
    }
	
	public static void main(String[] args) {
		System.out.println("This is my mobile");
		Mobile m = new Mobile();
		m.makecall("iphone14pro", 210.50f);
		m.sendmsg(true, 130000);
		
	}

}
