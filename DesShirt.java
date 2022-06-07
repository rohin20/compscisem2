package pkg;


public class DesShirt extends Clothing {
	String brand;
	public DesShirt(int price, String producer, String brand){
		super(price,producer);
		this.brand = brand;
		
	}
	
	public String getBrand(){
		return brand;
	}

	public void showOff(){
		System.out.println("wow this designer shirt is coool")
	}
	

	
	
	
	
}
