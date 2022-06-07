package pkg;


public class Clothing {
	int price;
	String producer;
	
	public Clothing(int price, String producer){
		this.price = price;
		this.producer = producer;
	
	}
	
	public int getPrice(){
		return price;
	}
	
	public String getProducer(){
		return producer;
	}
	
	public void showOff(){
		System.out.println("wow this clothing is coool");
	}
	
}
