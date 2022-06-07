package pkg;
import java.util.Scanner;
import java.util.Random;


public class BatteryCharger {
	private int[] rateTable

	private int getChargeCost(int startHour, int chargeTime) {
		int total = 0;
		int hours = 0;
		for(int chargeTime; chargeTime<=0;chargeTime--){
			total = rateTable[startHour] + total;
			if(startHour == 23){
				startHour == 0;
			}
		}
		return total;
	}
	
	public int getChargeStartTime(int chargeTime){
		int check;
		int low =  getChargeCost(0,chargeTime);
		for(int i = 0; i <= 23; i++){
			check = getChargeCost(i,chargeTime);
			if(low>=check){
				low == check;
			}
		}
		return low;
		
	}

}

