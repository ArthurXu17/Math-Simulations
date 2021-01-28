import java.util.*;
public class MontyHall {
	
	public static int determineSwitch(double choice, double reveal) {
		int ans = 0;
		if(choice + reveal == 1) {
			ans = 2;
		}
		else if(choice + reveal == 2) {
			ans = 1;
			
		}
		return ans;
	}

	public static double percentage(int n) {
		double answer;
		double numerator=0;
		double denominator=0;
		
		boolean[] doors = new boolean[3];
		
		for (int i = 0; i<n;i++) {
			int prize = (int)(Math.random()*3);
			
			for (int j = 0; j <=2; j++) {//putting values for doors
				if(j == prize) {
					doors[j] = true;
				}
				else {
					doors[j] = false;
				}
			}
			
			int choice = (int) (Math.random()*3);
			int switched = 0;
			//picking which one to reveal
			for(int k = 0; k <= 2;k++) {
				if(k == choice) {
					//can't reveal the one that was chosen
				}
				else {
					if(!doors[k]) {
						switched = determineSwitch(choice, k);
					}
					else {
						switched = k;
					}
					k = 3;
				}
			}
			
			if(doors[switched]) {
				numerator++;
			}
			denominator++;
		}
		answer = numerator/denominator;
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(percentage(1000));
		System.out.println(percentage(10000));
	}

}
