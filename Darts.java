/*
 Simulation for Numberphile/3Blue1Brown Video
 https://www.youtube.com/watch?v=6_yU9eJ0NxA&list=PLm0X6MqpAzQJ3tbmfsaew1WhOzlqSc7fO&index=78
 */
import java.util.*;
public class Darts {

	//method that plays the darts game n times and returns the average score
	public static double averageTurns (int n) {
		double cumulativeturns = 0;
		
		for(int i = 0; i < n;i++) {//playing game n times
			//resetting at the start of each game
			double radius = 1;//reset radius
			int turns = 0;//reset turns
			double magnitude = 1;
			
			do {
				radius = magnitude;//set radius to be that of previous magnitude
				double x = Math.random()*2-1;
				double y = Math.random()*2-1;
				magnitude = Math.sqrt(x*x+y*y);
				turns++;
			}while(magnitude <= radius);
			
			cumulativeturns += turns;//add the amount of turns of a given round to the total
		}
		
		return cumulativeturns/n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(averageTurns(10000));//play game 10000 time
		System.out.println(averageTurns(100000));//play game 100000 time
		System.out.println(Math.pow(Math.E, Math.PI/4));//theoretical value
	}

}
