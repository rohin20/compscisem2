package pkg;
import java.util.Scanner;
import java.util.Random;


public class CombinedTable implements SingleTable{
	int seats;
	int h = 0;
	int av = 0;
	double ans;
	public CombinedTable(SingleTable x, SingleTable y) {
		int c = x.getNumSeats();
		int f = y.getNumSeats();
		seats = c+f-2;
		h = x.getHeight();
		av = y.getHeight();
		if(h!= av){
			ans = x.getViewQuality()+y.getViewQuality();
			ans = av/2;
			ans = av-10;
		}
		if(h==av){
			ans = x.getViewQuality()+y.getViewQuality();
			ans = av/2;
		}
		
	}
	
	public boolean canSeat(int m){
		if(m>seats){
			return false;
		}
		if(seats>m){
			return true;
		}
	}
	
	public double getDesirability(){
		return ans;
	}

}

