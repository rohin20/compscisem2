package pkg;


public class Shirt extends Clothing {
	String material;
	public Shirt(int price, String producer, String material){
		super(price,producer);
		this.material = material;
		
	}
	
	public String getMat(){
		return material;
	}
	
	public void showOff(){
		System.out.println("wow this shirt is coool");
	}


	

	
	
	
	
}
