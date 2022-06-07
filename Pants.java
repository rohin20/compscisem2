package pkg;


public class Pants extends Clothing {
	String length;
	public Pants(int price, String producer, String length){
		super(price,producer);
		this.length = length;
		
	}
	
	public String getLen(){
		return length;
	}


	public void showOff(){
		System.out.println("wow these pants are coool")
	}

	
	
	
	
}
