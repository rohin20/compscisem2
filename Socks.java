package pkg;


public class Socks extends Clothing {
	String type;
	public Socks(int price, String producer, String type){
		super(price,producer);
		this.type = type;
		
	}
	
	public String getType(){
		return type;
	}


	

	
	
	
	
}
