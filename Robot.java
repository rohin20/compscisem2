package pkg;

public class Robots {		
	private int[] hall;
	private int pos;
	private boolean facingRight;
	public int m = 0;
	
	private boolean forwardMoveBlocked(){
		if(facingRight){
			if(pos==hall.length){
				return true;
			}
		}
		else if(facingRight == false){
			if(pos==0){
				return true;
			}
		}
		else{
			return false;
		}
	}
	private void move(){
		if(hall[pos]!=0){
			hall[pos] = hall[pos]-1;
		}
		if(hall[pos]==0){
			if(forwardMoveBlocked == false){
				if(facingRight){
					pos=pos+1;
				}
			}
			if(forwardMoveBlocked){
				facingRight == false;
				pos = pos-1;
			}
		}
	}
	public int clearHall(){
		while(hallsClear == false){
			move();
			m = m+1;
		}
		return m;
	}


}
